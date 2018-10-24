package ru.pecom.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecoveryPassword extends BasePage {
    private String locatorTextTitleWindow = ".modal-header .modal-title";
    private String locatorIkonCloseWindow = ".close span";
    private String locatorTextNotify = ".col-md-7 .text-center";
    private String locatorFieldInput = ".form-control-pecom";
    private String locatorTextError = ".error-message";
    /*private String locatorButtonCloseWindow = ".close";
    private String locatorButtonNext = ".btn-next";
    private String locatorLink = ".modal-link";*/
    @FindBy(css = ".close")
    public WebElement buttonCloseWindow;
    @FindBy(css = ".btn-next")
    public WebElement buttonNext;
    @FindBy(css = ".modal-link")
    public WebElement linkNotLogin;
    @FindBy(css = ".form-control-pecom")
    public WebElement fieldInput;
    @FindBy(css = "#dropdownMenuButton")
    public WebElement selectCountryPhone;
    @FindBy(css = ".input_phone")
    public WebElement fieldInputPhone;


    public RecoveryPassword(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String textTitle() {
        return getTextCss(locatorTextTitleWindow);
    }

    public String textNotify() {

        return getTextCss(locatorTextNotify);
    }

    public boolean presentIkonCloseWindow() {

        return visibilityElement(locatorIkonCloseWindow);
    }

    public String textPlaceholderField() {

        return getAttribute(locatorFieldInput, "placeholder");
    }

    public String textLinkNotLogin() {

        return linkNotLogin.getText();
    }


    /*public boolean presentButtonNext(){
        return elementIsEnable(buttonNext);
    }*/

    public String textError(){
        return getTextCss(locatorTextError);
    }

    public boolean showInField(String expected) {
        try {
            waitElementTextToBe(fieldInputPhone, 1, expected);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void inputLoginUser(String login){
        inputLogin(locatorFieldInput,login);
    }


}
