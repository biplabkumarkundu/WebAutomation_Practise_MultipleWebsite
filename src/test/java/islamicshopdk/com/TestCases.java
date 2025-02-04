package islamicshopdk.com;

import org.example.DriverSetup;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends DriverSetup {
    AddToCartPage addToCartPage=new AddToCartPage();
    CheckOutPage checkOutPage=new CheckOutPage();
    HomePage homePage=new HomePage();

    @Test
    public void testIslamicshopdhk() throws InterruptedException {
    driver.get("https://deal.islamicshopdk.com/"); //Visit this site
      //  Assert.assertEquals(homePage.pageTitle,"ইসলামিক শপ ঢাকা – সেরা বই সেরা দামে সবার আগে");
    clickOneElement(homePage.logo);
        Actions actions=new Actions(driver); //Scroll Down and Go to the Next Page
        actions.scrollToElement(getElement(homePage.islamicShopDhaka)).build().perform();
        Assert.assertTrue(is_element_visible(homePage.nextPageButton));
        Thread.sleep(3000);
        clickOneElement(homePage.nextPageButton);
        Assert.assertTrue(is_element_visible(addToCartPage.addToCartButton));

        Assert.assertEquals(getElement(addToCartPage.addToCartButton).getText(),"Add to cart");
        clickOneElement(addToCartPage.anyBook); //View any book
        Assert.assertTrue(is_element_visible(addToCartPage.addToCartButton2));
        Assert.assertTrue(is_element_visible(addToCartPage.addToCartText2));
        Assert.assertEquals(getElement(addToCartPage.addToCartButton2).getText(),"Add to cart");
        clickOneElement(addToCartPage.addToCartButton2); //Click Add to Cart
Assert.assertEquals(getElement(addToCartPage.proceedToCheckout).getText(),"Proceed to Checkout");
Assert.assertTrue(is_element_visible(addToCartPage.proceedToCheckout));
Assert.assertTrue(is_element_visible(addToCartPage.cartForAssert));
        clickOneElement(addToCartPage.proceedToCheckout);//click checkout
        Thread.sleep(3000);
        Assert.assertEquals(getElement(checkOutPage.checkoutPageText).getText(),"Checkout");
        Assert.assertTrue(is_element_visible(checkOutPage.email));
        Assert.assertTrue(is_element_visible(checkOutPage.country));
        Assert.assertTrue(is_element_visible(checkOutPage.firstName));
        Assert.assertTrue(is_element_visible(checkOutPage.lastName));
        Assert.assertTrue(is_element_visible(checkOutPage.address));
        writeOnElement(checkOutPage.email,"biplabkundu101@gmail.com");//provide all information
        selectOnElement(checkOutPage.country,"Bangladesh");
        writeOnElement(checkOutPage.firstName,"Biplab Kumar");
        writeOnElement(checkOutPage.lastName,"Kundu");
        writeOnElement(checkOutPage.address,"Nikunja-2,Khilkhet,Dhaka");
        selectOnElement(checkOutPage.district,"Dhaka");
        writeOnElement(checkOutPage.postalCode,"1229");
        writeOnElement(checkOutPage.phone,"01852485898");
        actions.scrollToElement(getElement(checkOutPage.placeOrderButton)).build().perform();
        Thread.sleep(3000);
        clickOneElement(checkOutPage.shippingOptions);
        clickOneElement(checkOutPage.addANote);
        writeOnElement(checkOutPage.addANoteText,"Your Testing End here");

        Thread.sleep(3000);
    }
}
