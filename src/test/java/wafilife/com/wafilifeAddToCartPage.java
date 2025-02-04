package wafilife.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;

public class wafilifeAddToCartPage extends DriverSetup {
    public By nextPageArrow=By.xpath("//a[contains(text(),'→')]");
    public By any_author=By.xpath("//h3[normalize-space()='Mashhur Hasan Salman']");
    public By any_book=By.xpath("//a[contains(text(),'The Concise Presentation of the Fiqh')]");
    public By order_korun_btn=By.xpath("//div[@class='body-wrapper']//button[2]");
    public By order_sompurno_btn=By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
    public By lekhok_page=By.xpath("//h1[contains(text(),'লেখক')]");
}
