package wafilife.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;

public class wafilifeAccountPage extends DriverSetup {
    public By dashButton=By.xpath("//a[contains(text(),'ড্যাশবোর্ড')]");
    public By logoutButton=By.xpath("//a[contains(text(),'লগআউট')]");
    public By profileButton=By.xpath("//a[contains(text(),'প্রোফাইল')]");

}
