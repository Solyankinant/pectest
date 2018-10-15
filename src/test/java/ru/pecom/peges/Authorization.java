package ru.pecom.peges;

import org.openqa.selenium.WebDriver;

public class Authorization extends BasePage {
    WebDriver driver;
    public String locatorButtonOpenLK = ".buttonOpenLK";
    public String locatorLevelUser = ".block-level span";
    public String locatorFieldInputLogin = ".form-control-pecom";
    public String locatorFieldPassword = "input[type=\"password\"]";
    public String locatorButtonEnterLK = ".col-md-9 .btn-primary";
    public String locatorIconClose = ".close span";
    public String titlewindow = ".modal-title";
    public String textNotification = ".col-md-9 p:nth-of-type(1)";
    public  String filedInputPhone = ".input_phone";
    public String textButtonEnter = ".login-col-2 span";
    public String linkLosePassword = ".login-col-1 p:nth-of-type(2) ";

    /*@FindBy(css = ".lk-menu")
    private WebElement locatorLkMenu;*/
    public String menuLK = ".lk-menu";

    public Authorization(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void authorizationPecLk(String locatorField, String firstCharacter, String login, String password) {
        waitElement(locatorFieldInputLogin,5);
        inputSendKeysCss(locatorFieldInputLogin, firstCharacter);
        waitElement(locatorField,5);
        inputSendKeysCss(locatorField, login);
        waitElement(locatorFieldPassword,5);
        inputSendKeysCss(locatorFieldPassword, password);
        buttonClickCss(locatorButtonEnterLK);
        waitElement(menuLK,10);
    }

    public void exitLk() {
        buttonClickCss(locatorButtonOpenLK);
    }

}