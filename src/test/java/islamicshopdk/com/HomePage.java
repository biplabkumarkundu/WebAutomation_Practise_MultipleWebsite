package islamicshopdk.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;

public class HomePage extends DriverSetup {
    public String pageURL="https://deal.islamicshopdk.com/";
    public String pageTitle="ইসলামিক শপ ঢাকা – সেরা বই সেরা দামে সবার আগে";
    public By islamicShopDhaka= By.xpath("//a[normalize-space()='ISLAMIC SHOP DHAKA']");
    public By nextPageButton=By.xpath("//a[contains(text(),'→')]");
    public By logo=By.xpath("//div[@class='site-primary-header-wrap ast-builder-grid-row-container site-header-focus-item ast-container']//img[@alt='ইসলামিক শপ ঢাকা']");


}
