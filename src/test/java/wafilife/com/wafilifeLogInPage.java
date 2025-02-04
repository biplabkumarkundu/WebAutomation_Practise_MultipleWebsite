package wafilife.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;

public class wafilifeLogInPage extends DriverSetup {
    public By userName=By.xpath("//input[@id='username']");
    public By password=By.xpath("//input[@id='password']");
    public By loginButton=By.xpath("//input[@name='login']");
}
