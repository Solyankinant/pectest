package Pages;

import org.openqa.selenium.WebDriver;

public class Authorization extends BasePage {
    WebDriver driver;
    public String locatorButtonLK = ".buttonOpenLK";
    public String locatorLevelUser = ".block-level span";
    protected String locatorFieldLogin = ".form-control-pecom";
    protected String locatorFieldPassword = "//input[@type=\"password\"]";
    protected String locatorButtonEnterLK = ".col-md-9 .btn-primary";

    public Authorization(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void authorizationPecLk(String login, String password) {
        buttonClickCss(locatorButtonLK);
        inputSendKeysCss(locatorFieldLogin, login);
        inputSendKeysXpath(locatorFieldPassword, password);
        buttonClickCss(locatorButtonEnterLK);
    }

    public void exitLk() {
        buttonClickCss(locatorButtonLK);
    }

}