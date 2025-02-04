package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wafilife extends DriverSetup{
    public By login_register =By.xpath("//a[@title='আমার অ্যাকাউন্ট']");

    public By userName=By.xpath("//input[@id='username']");
    public By password=By.xpath("//input[@id='password']");
    public By loginButton=By.xpath("//input[@name='login']");
    public By dashButton=By.xpath("//a[contains(text(),'ড্যাশবোর্ড')]");
    public By logoutButton=By.xpath("//a[contains(text(),'লগআউট')]");
    public By profileButton=By.xpath("//a[contains(text(),'প্রোফাইল')]");
    public By lekhokButton=By.xpath("//span[contains(text(),'লেখক')]");
    public By nextPageArrow=By.xpath("//a[contains(text(),'→')]");
    public By any_author=By.xpath("//h3[normalize-space()='Mashhur Hasan Salman']");
    public By any_book=By.xpath("//div[@class='product_thumbnail_wrapper']//a");
    public By order_korun_btn=By.xpath("//button[@class='single_add_to_cart_button button alt ']");
    public By order_sompurno_btn=By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");


@Test
    public void TestWafilife() throws InterruptedException {
        driver.get("https://www.wafilife.com/");

        clickOneElement(login_register);
        writeOnElement(userName,"biplabkundu101@gmail.com");
        writeOnElement(password,"bk123456");
        clickOneElement(loginButton);
    Assert.assertTrue(is_element_visible(logoutButton));
    Assert.assertTrue(is_element_visible(dashButton));
    Assert.assertEquals(getElement(profileButton).getText(),"প্রোফাইল");

        clickOneElement(lekhokButton);
Thread.sleep(3000);
    Actions actions=new Actions(driver);
    actions.scrollToElement(getElement(nextPageArrow)).build().perform();
    clickOneElement(nextPageArrow);
    clickOneElement(any_author);
    clickOneElement(any_book);
    clickOneElement(order_korun_btn);
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(order_sompurno_btn));
    clickOneElement(order_sompurno_btn);

        Thread.sleep(4000);
    }

}
