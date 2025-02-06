package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {
    public WebDriver driver;

    @BeforeSuite
    public void openBrowser()
    {
        //Open a bowser
        //WebDriverManager.chromedriver().setup();

//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--disable-notifications");
//       options.addArguments("--disable-ads");
//        driver = new ChromeDriver(options);
driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
////
////
////        driver.manage().window().maximize();
//        //browser=new EdgeDriver();


    }

    @AfterSuite
    public void closeBrowser(){
        //Close Browser
        driver.quit();
    }

    public WebElement getElement(By locator)
    {

        return driver.findElement(locator);
    }
    public void clickOneElement(By locator){

        getElement(locator).click();
    }
    public void clickTwoElement(By locator ,By locator2){

        getElement(locator).click();
        getElement(locator2).click();
    }
    public void writeOnElement(By locator, String text){

        getElement(locator).sendKeys(text);
    }
    public void  selectOnElement(By locator,String value){
        getElement(locator).click();
        WebElement el=getElement(locator);
        Select select=new Select(el);
        select.selectByVisibleText(value);
    }

    public Boolean is_element_visible(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}