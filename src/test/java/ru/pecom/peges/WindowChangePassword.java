package ru.pecom.peges;

import org.openqa.selenium.WebDriver;

public class WindowChangePassword extends BasePage{
    private String locatorTextTitleWindow = ".modal-header .modal-title";
    private String locatorTextUpNotify = ".col-md-8 p:nth-of-type(1)";
    private String locatorTextDownNotify = ".col-md-8 p:nth-of-type(2)";
    private String locatorFieldCodeSms = ".restore-col-1>input";
    private String locatorFieldNewPassword = "[type=\"password\"]:nth-of-type(1)";
    private String locatorFieldNewPasswordRepeat = "[type=\"password\"]:nth-of-type(2)";
    private String locatorButtonSave = ".btn-save";
    private String locatorLinkRepeatCode = ".modal-link";
    private String locatorTextErrorPassword = ".error-message:nth-child(2)";
    /*private String locatorTextErrorCode = ".error-message:nth-child(1)";*/


    public WindowChangePassword(WebDriver driver) {
        super(driver);
    }

    public String textFirstNotify(){
        return getTextCss(locatorTextUpNotify);
    }

    public String textSecondNotify(){
        return getTextCss(locatorTextDownNotify);
    }

    public String textTitle() {

        return getTextCss(locatorTextTitleWindow);
    }

    public String textFieldCodeSms() {

        return getAttribute(locatorFieldCodeSms,"placeholder");
    }

    public String textFieldNewPassword() {

        return getAttribute(locatorFieldNewPassword,"placeholder");
    }

    public String textFieldNewPasswordRetern() {

        return getAttribute(locatorFieldNewPasswordRepeat,"placeholder");
    }

    public String textButton(){
        return getTextCss(locatorButtonSave);
    }

    public boolean presentButton(){
        return visibilityElement(locatorButtonSave);
    }

    public boolean linkRepeatCode(){
        return visibilityElementWait(locatorLinkRepeatCode,30);
    }

    public void inputCodeSms(String code){
        inputSendKeysCss(locatorFieldCodeSms, code);
    }

    /*public String textErrorCode(){
            return getTextCss(locatorTextErrorCode);
    }*/
    public String textErrorPassword(){
        return getTextCss(locatorTextErrorPassword);
    }

    public String textLinkRepeatCodeSms(){
        return getTextCss(locatorLinkRepeatCode);
    }

    public void clickButtonSave(){
        buttonClickCss(locatorButtonSave);
    }

    public void inputPassword(String newPassword){
        inputSendKeysCss(locatorFieldNewPassword,newPassword);
    }

    public void inputPasswordRepeat(String repeatNewPassword){
        inputSendKeysCss(locatorFieldNewPasswordRepeat,repeatNewPassword);
    }





}
