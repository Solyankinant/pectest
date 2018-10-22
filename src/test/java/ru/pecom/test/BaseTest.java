package ru.pecom.test;

import ru.pecom.peges.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    ChromeDriver driver;
    private Authorization authorization;
    private FieldSearchCargoInMenu fieldSearchCargoInMenu;
    private Footer footer;
    private EventsFeed eventsFeed;
    private Menu menusite;
    private LKContent lkContent;
    private FloatingButtons floatButtons;
    private RecoveryPassword recoveryPassword;
    private WindowChangePassword changePassword;

    @BeforeMethod
    public void openSitePec() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        authorization = new Authorization(driver);
        fieldSearchCargoInMenu = new FieldSearchCargoInMenu(driver);
        footer = new Footer(driver);
        eventsFeed = new EventsFeed(driver);
        menusite = new Menu(driver);
        lkContent = new LKContent(driver);
        floatButtons = new FloatingButtons(driver);
        recoveryPassword = new RecoveryPassword(driver);
        changePassword = new WindowChangePassword(driver);
        driver.get("http://192.168.111.62/#/");
    }

    public void openStartPage() {
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

    public Footer getFooter() {
        return footer;
    }

    public EventsFeed getEventsFeed() {
        return eventsFeed;
    }

    public Menu getMenusite(){return menusite;}

    public LKContent getLkContent(){return lkContent;}

    public  FloatingButtons getFloatButtons(){ return floatButtons;}
    public RecoveryPassword getRecoveryPassword(){return recoveryPassword;}
    public WindowChangePassword getChangePassword(){return changePassword;}


}