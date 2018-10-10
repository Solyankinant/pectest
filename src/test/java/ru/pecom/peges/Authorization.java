package ru.pecom.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authorization extends BasePage {
    WebDriver driver;
    public String locatorButtonLK = ".buttonOpenLK";
    public String locatorLevelUser = ".block-level span";
    protected String locatorFieldLogin = ".form-control-pecom";
    protected String locatorFieldPassword = "//input[@type=\"password\"]";
    protected String locatorButtonEnterLK = ".col-md-9 .btn-primary";
    /*@FindBy(css = ".lk-menu")
    private WebElement locatorLkMenu;*/
    String menuLK = ".lk-menu";

    public Authorization(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void authorizationPecLk(String login, String password) {
        buttonClickCss(locatorButtonLK);
        inputSendKeysCss(locatorFieldLogin, login);
        inputSendKeysXpath(locatorFieldPassword, password);
        buttonClickCss(locatorButtonEnterLK);
        waitElement(menuLK);
    }

    public void exitLk() {
        buttonClickCss(locatorButtonLK);
    }

}