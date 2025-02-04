package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Rokomari extends DriverSetup{

    public By lekhok_btn= By.xpath("//a[@id='js--authors']");

//    public By popUp_screen=By.className("p-2 bg-white rounded-lg");
//
//    public By popUp_close=By.id("absolute bg-white rounded-full p-2 shadow");

    @Test
    public void RokomariTestCases() throws InterruptedException {
        driver.get("https://www.rokomari.com/");
//        if(is_element_visible(popUp_screen)) {
//            getElement(popUp_close).click();
//        }
       // System.out.println(getElement(lekhok_btn).getText());
        WebElement el= getElement(lekhok_btn);
        Select select=new Select(el);
        select.selectByIndex(0);

        List < WebElement> linkElements = driver.findElements(By.xpath("//span[contains(text(),'লেখক')]"));
        System.out.println(linkElements.size());

    }
}
