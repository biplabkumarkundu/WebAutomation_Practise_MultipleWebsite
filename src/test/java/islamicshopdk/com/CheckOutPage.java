package islamicshopdk.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;

public class CheckOutPage extends DriverSetup {
    public By checkoutPageText=By.xpath("//h1[normalize-space()='Checkout']");
    public By email= By.xpath("//input[@id='email']");
    public By country=By.xpath("//select[@id='billing-country']");
    public By firstName=By.xpath("//input[@id='billing-first_name']");
    public By lastName=By.xpath("//input[@id='billing-last_name']");
    public By address=By.xpath("//input[@aria-label='Address']");
    public By city=By.xpath("//input[@id='billing-city']");
    public By district=By.xpath("//select[@id='billing-state']");
    public By state=By.xpath("//input[@id='billing-state']");
    public By postalCode =By.xpath("//input[@id='billing-postcode']");
    public By phone=By.xpath("//input[@id='billing-phone']");
    public By addANote=By.xpath("//span[normalize-space()='Add a note to your order']");
    public By addANoteText=By.xpath("//textarea[@placeholder='Notes about your order, e.g. special notes for delivery.']");
    public By placeOrderButton=By.xpath("//button[@class='wc-block-components-button wp-element-button wc-block-components-checkout-place-order-button contained']");
    public By shippingOptions=By.xpath("//label[@for='radio-control-0-flat_rate:2']");
}
