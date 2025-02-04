package islamicshopdk.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;

public class AddToCartPage extends DriverSetup {

    public By anyBook=By.xpath("//h2[contains(text(),'রিয়াদুস সালিহীন-প্রিমিয়াম ভার্সন (দুখন্ডে পুরোটা ব')]");
    public By addToCartButton=By.xpath("//a[normalize-space()='Add to cart']");
    public By addToCartButton2=By.xpath("//div[@class='summary entry-summary']//button[@name='add-to-cart'][normalize-space()='Add to cart']");
    public By addToCartText2=By.xpath("//h1[contains(text(),'রিয়াদুস সালিহীন-প্রিমিয়াম ভার্সন (দুখন্ডে পুরোটা ব')]");
    public By proceedToCheckout=By.xpath("//span[@class='wc-block-components-button__text']");
    public By cartForAssert=By.xpath("//h1[normalize-space()='Cart']");


}
