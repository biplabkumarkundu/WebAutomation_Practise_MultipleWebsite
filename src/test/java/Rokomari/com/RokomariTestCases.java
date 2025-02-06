package Rokomari.com;

import islamicshopdk.com.AddToCartPage;
import islamicshopdk.com.HomePage;
import org.example.DriverSetup;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class RokomariTestCases extends DriverSetup {
    RokomariHomePage homePage=new RokomariHomePage();
    RokomariAuthorPage authorPage=new RokomariAuthorPage();
    RokomariAddToCartPage addToCartPage=new RokomariAddToCartPage();
    @Test
    public void TestRokomari() throws InterruptedException {
        driver.get("https://www.rokomari.com/");

        driver.navigate().refresh();

        clickOneElement(homePage.lekhokButton);

       clickOneElement(authorPage.anyAuthor);
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        actions.scrollToElement(getElement(authorPage.publisher)).build().perform();

        clickOneElement(authorPage.somokalinUponnas);
        actions.scrollToElement(getElement(authorPage.publisher)).build().perform();
        clickOneElement(authorPage.roconaSomogro);
        Thread.sleep(3000);
        actions.scrollToElement(getElement(authorPage.nextPageButton)).build().perform();
        clickOneElement(authorPage.nextPageButton);
        actions.moveToElement(getElement(authorPage.anyBook)).build().perform();
        clickOneElement(authorPage.addToCartButton);
        clickOneElement(authorPage.addToCartButton);
        Thread.sleep(3000);
        clickOneElement(addToCartPage.cartButton);
        Thread.sleep(3000);
    }
}
