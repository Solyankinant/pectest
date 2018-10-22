package ru.pecom.peges;

import org.openqa.selenium.WebDriver;

public class Authorization extends BasePage {
    WebDriver driver;
    public String locatorButtonOpenLK = ".buttonOpenLK";
    public String locatorLevelUser = ".block-level span";
    public String locatorFieldInputLogin = ".form-control-pecom";
    private String locatorFieldPassword = "input[type=\"password\"]";
    private String locatorButtonEnterLK = ".col-md-9 .btn-primary";
    public String locatorIconClose = ".close span";
    public String titlewindow = ".modal-title";
    public String textNotification = ".col-md-9 p:nth-of-type(1)";
    public String filedInputPhone = ".input_phone";
    public String textButtonEnter = ".login-col-2 span";
    public String linkLosePassword = ".login-col-1 p:nth-of-type(2) ";
    private String menuLK = ".lk-menu";
    private String listCountryPhone = "#dropdownMenuButton";
    private String closeWindowAuthorization = ".close";
    protected String imgFlagCountry = "#dropdownMenuButton img";
    protected String CountryPhoneInList = "[href=\"#\"]";


    public Authorization(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void authorizationLoginPecLk() {
        openWindowAthorization();
        inputLoginUser("pecomtest1");
        inputPassword("pecomtest1");
        clickButtonEnter();
        visibleLkMenu();
    }

    public void inputLoginUser(String login){
        inputLogin(locatorFieldInputLogin,login);
    }

    public void inputPhoneUser(String phone){
        inputPhone(locatorFieldInputLogin,filedInputPhone,phone);
    }

    public void inputPassword(String password){
        inputInField(locatorFieldPassword, password);
    }
    public void clickButtonEnter(){
        buttonClickCss(locatorButtonEnterLK);
    }

    public boolean visibleLkMenu(){
        return visibilityElementWait(menuLK, 10);
    }

    public String getTextButtonLk(){
        return getTextCss(locatorButtonOpenLK);
    }

    public String textLevelUser(){
        return getTextCss(locatorLevelUser);
    }

    public boolean visibilitySelectCountryTel(){
        return visibilityElement(listCountryPhone);
    }

    public boolean visibilityFieldPassword(){
        return visibilityElement(locatorFieldPassword);
    }

    public String placeholderFieldPassword (){
        return getAttribute(locatorFieldPassword,"placeholder");
    }

    public void openWindowAthorization(){
        buttonClickCss(locatorButtonOpenLK);
    }

    public void inputFirstChar(String firstChar){
        inputSendKeysCss(locatorFieldInputLogin, firstChar);
    }

    public void exitLk() {
        buttonClickCss(locatorButtonOpenLK);
    }

    public void closeWindowAuthorization(){
        buttonClickCss(closeWindowAuthorization);
    }

    public void openListSelectCountry(){
        buttonClickCss(listCountryPhone);
    }

    public void selectCountryPhone(String country){
        clickButtonElementList("[href=\"#\"]",country);
    }

    public String imgFlagCountry(){
        return getAttribute(imgFlagCountry, "src");
    }

    public boolean checkCountryInList(String country){
        return comparisonElementList(CountryPhoneInList,country);
    }

    public void openWindowRecoveryPassword(){
        openWindowAthorization();
        buttonClickCss(linkLosePassword);
    }

}