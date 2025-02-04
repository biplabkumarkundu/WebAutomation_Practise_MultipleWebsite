package wafilife.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class wafilifeHomePage extends DriverSetup {

    public By login_register =By.xpath("//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'লগইন / রেজিস্টার')]");

    public By lekhokButton=By.xpath("//span[contains(text(),'লেখক')]");





}
