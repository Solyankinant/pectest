package Test;

import Pages.Authorization;
import Pages.EventsFeed;
import Pages.FieldSearchCargoInMenu;
import Pages.Footer;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    ChromeDriver driver;
    private Authorization authorization;
    private FieldSearchCargoInMenu fieldSearchCargoInMenu;
    private Footer footer;
    private EventsFeed eventsFeed;

@BeforeMethod
    public void openSitePec() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        authorization = new Authorization(driver);
        fieldSearchCargoInMenu = new FieldSearchCargoInMenu(driver);
        footer = new Footer(driver);
        eventsFeed = new EventsFeed(driver);
        driver.get("http://192.168.111.62/#/");
    }

    public void openStartPage(){
        driver.get("http://192.168.111.62/#/");
    }

@AfterMethod
    public void closseBrauser() {
        driver.quit();
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public FieldSearchCargoInMenu getFieldSearchCargoInMenu() {
        return fieldSearchCargoInMenu;
    }

    public Footer getFooter(){
        return footer;
    }
    public EventsFeed getEventsFeed(){return eventsFeed; }


}