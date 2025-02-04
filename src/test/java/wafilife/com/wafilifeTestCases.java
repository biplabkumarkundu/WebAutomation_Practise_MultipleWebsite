package wafilife.com;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class wafilifeTestCases extends DriverSetup {
    wafilifeHomePage homePage=new wafilifeHomePage();
    wafilifeAccountPage accountPage=new wafilifeAccountPage();
    wafilifeLogInPage logInPage=new wafilifeLogInPage();
    wafilifeAddToCartPage addToCartPage=new wafilifeAddToCartPage();
    wafilifeCheckoutPage checkoutPage = new wafilifeCheckoutPage();

    @Test
    public void TestWafilife() throws InterruptedException {
        driver.get("https://www.wafilife.com/");

        clickOneElement(homePage.login_register);//Visit this site and login the site
        writeOnElement(logInPage.userName,"biplabkundu101@gmail.com");
        writeOnElement(logInPage.password,"bk123456");
        clickOneElement(logInPage.loginButton);
        Assert.assertTrue(is_element_visible(accountPage.logoutButton));
        Assert.assertTrue(is_element_visible(accountPage.dashButton));
        Assert.assertEquals(getElement(accountPage.profileButton).getText(),"প্রোফাইল");

        clickOneElement(homePage.lekhokButton); //Click  লেখক from the menu
        Assert.assertTrue(is_element_visible(addToCartPage.lekhok_page));
        Assert.assertEquals(getElement(addToCartPage.lekhok_page).getText(),"লেখক");
        Thread.sleep(3000);

        Actions actions=new Actions(driver); //Scroll Down and go to the Next Page
        actions.scrollToElement(getElement(addToCartPage.nextPageArrow)).build().perform();
        clickOneElement(addToCartPage.nextPageArrow);
        Assert.assertTrue(is_element_visible(addToCartPage.any_author));
        Assert.assertEquals(getElement(addToCartPage.any_author).getText(),"Mashhur Hasan Salman");

        clickOneElement(addToCartPage.any_author); //Select any Author
        Assert.assertTrue(is_element_visible(addToCartPage.any_book));
        Assert.assertEquals(getElement(addToCartPage.any_book).getText(),"The Concise Presentation of the Fiqh");

        clickOneElement(addToCartPage.any_book); //View any Book Details
        Assert.assertTrue(is_element_visible(addToCartPage.order_korun_btn));
        Assert.assertEquals(getElement(addToCartPage.order_korun_btn).getText(),"অর্ডার করুন");

        clickOneElement(addToCartPage.order_korun_btn); // Click অর্ডার করুন
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartPage.order_sompurno_btn));

        clickOneElement(addToCartPage.order_sompurno_btn);  //  Click অর্ডার সম্পন্ন করুন
        Assert.assertTrue(is_element_visible(checkoutPage.place_order_btn));
        Assert.assertTrue(is_element_visible(checkoutPage.billing_Tikana));
        Assert.assertTrue(is_element_visible(checkoutPage.billing_options));
        Assert.assertEquals(getElement(checkoutPage.billing_options).getText(),"ডেলিভারি অ্যাড্রেসটি কি কোন অফিসের ঠিকানা? ");
        Thread.sleep(3000);

        WebElement selectElement=getElement(checkoutPage.billing_area);  //Provide all Information of  আপনার বিলিং এবং শিপিং তথ্য
        selectElement.click();
        Select select=new Select(selectElement);
        select.selectByVisibleText("আগারগাঁও");
        System.out.println(select.getOptions());
        Thread.sleep(3000);
        writeOnElement(checkoutPage.billing_Tikana,"Adabor 15,Mohammadpur,Dhaka");
        writeOnElement(checkoutPage.onnanno_field,"N/A");
        clickOneElement(checkoutPage.billing_options);
        actions.scrollToElement(getElement(checkoutPage.place_order_btn)).build().perform();
        clickOneElement(checkoutPage.bkash_btn);


        Thread.sleep(4000); //Log Out
    }
}
