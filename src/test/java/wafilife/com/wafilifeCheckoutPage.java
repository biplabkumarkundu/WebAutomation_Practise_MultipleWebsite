package wafilife.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;

public class wafilifeCheckoutPage extends DriverSetup {

    public By billing_jela =By.xpath("//select[@id='billing_state']");
    public By billing_area=By.xpath("//select[@id='billing_area']");
    public By onnanno_field=By.xpath("//textarea[@id='order_comments']");
    public By billing_options=By.xpath("//label[@autocomplete='ship-to-office']");
    public By payment_method=By.xpath("//ul[@class='payment_methods methods']");
    public By billing_Tikana=By.xpath("//textarea[@name='billing_address_1']");
    public By dhaka_btn=By.id("select2-selection__rendered");
    public By place_order_btn=By.xpath("//button[@id='place_order']");
    public By bkash_btn=By.xpath("//label[contains(text(),'বিকাশ')]");

}
