package ru.pecom.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewCasePage extends BasePage {
    private String locatorTitleWindow = "#modalVisible .headerr";
    private String locatorIkonCloseWindow = "#modalVisible .spann";
    private String locatorTextTheme = "[for=\"inpuTema\"]";
    private String locatorFieldSelectTheme = "#modalVisible .mainselection";
    private String locatorListSelectTheme = "#modalVisible option";
    private String locatorTitleTextMessage = "[for=\"inputText\"]";
    private String locatorFieldInputMessage = "#inputText";
    private String locatorLinkAttachment = ".send-mess-file-label";
    private String locatorTextNotify = ".max-file-count";
    private String locatorButtonSend = "#modalVisible .btn.btn-primary";
    private String locatorErrorTheme = ".form-group:nth-of-type(1) .invalid-feedback";
    private String locatorErrorMessageText = ".form-group:nth-of-type(2) .invalid-feedback";
    private String locatorErrorFile = ".send-mess-file-label-max";
    private String locatorNameFile = "#modalVisible .inline>span:nth-of-type(1)";
    private String locatorSizeFile = "#modalVisible .inline .size";
    private String locatorButtonDelFile = "#modalVisible .close";
    private String locatorIkonDelFile = "#modalVisible .close span";
    private String windowCreateNewMessage = "#modalVisible";



    public NewCasePage(WebDriver driver) {
        super(driver);
    }

    public String titleWindow() {
        visibilityElementWait(locatorTitleWindow, 5);
        return getTextCss(locatorTitleWindow);
    }

    public boolean ikonCloseWindow() {
        return visibilityElementWait(locatorIkonCloseWindow, 1);
    }

    public String textThem() {
        visibilityElementWait(locatorTitleWindow, 5);
        return getTextCss(locatorTextTheme);
    }

    public String textTitleFieldMessage() {
        visibilityElementWait(locatorTitleWindow, 5);
        return getTextCss(locatorTitleTextMessage);
    }

    public boolean linkAttachment() {
        return visibilityElementWait(locatorLinkAttachment, 1);
    }

    public String textNotify() {
        visibilityElementWait(locatorTitleWindow, 5);
        return getTextCss(locatorTextNotify);
    }

    public boolean presentButtonSend() {
        return visibilityElementWait(locatorButtonSend, 1);
    }

    public void selectTheme(String themeMessage) {
        buttonClickCss(locatorFieldSelectTheme);
        WebElement selectElem = driver.findElement(By.tagName("select"));
        Select select = new Select(selectElem);
        select.selectByVisibleText(themeMessage);
        buttonClickCss(locatorFieldSelectTheme);

    }

    public void inputTextMessage(String text) {
        inputSendKeysCss(locatorFieldInputMessage, text);
    }
    public void closeWindowNewMessage(){
        buttonClickCss(locatorIkonCloseWindow);
    }

    public String textErrorTheme(){
        return getTextCss(locatorErrorTheme);
    }
    public String textErrorMessageText(){
        return getTextCss(locatorErrorMessageText);
    }

    public void clickButtonSendMessage(){
        buttonClickCss(locatorButtonSend);
    }

    public boolean invisibleWindow(){
        try {
            waitElementInvisibility(windowCreateNewMessage,5);
            return true;
        }catch (TimeoutException e){return false;}
    }

}
