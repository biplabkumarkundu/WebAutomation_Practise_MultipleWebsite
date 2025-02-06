package Rokomari.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;

public class RokomariAuthorPage extends DriverSetup {
    public By anyAuthor=By.xpath("//div[@class='authorListItem']//a//div//img[@alt='Humayun Ahmed']");
    public By somokalinUponnas=By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By roconaSomogro=By.xpath("//label[@for='rok-filter-categoryIds-1321']");
    public By publisher=By.xpath("//p[normalize-space()='By Publishers']");
    public By nextPageButton=By.xpath("//i[@class='ion-chevron-right']");
    public By anyBook=By.xpath("//div[@title='কোথাও কেউ নেই হুমায়ূন আহমেদ']//div[@class='book-list-wrapper ']");
    public By addToCartButton=By.xpath("//div[@title='কোথাও কেউ নেই হুমায়ূন আহমেদ']//div[1]//div[3]//button[1]");

}
