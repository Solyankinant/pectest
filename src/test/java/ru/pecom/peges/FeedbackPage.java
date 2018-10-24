package ru.pecom.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeedbackPage extends BasePage {
    private String locatorButtonNewMessage = ".feedback-block button[type=\"button\"]";
    private String locatorThemeMessages = ".mess-item:nth-child(1) .mess-tema";
    private String locatorTextMessage = ".mess-item:nth-child(1) .mess-text";


    public FeedbackPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonNewMessage(){
        buttonClickCss(locatorButtonNewMessage);
    }

    public String themeFirstMessage(){
        return getTextCss(locatorThemeMessages);
    }
    public String textFirstMessage(){
        return getTextCss(locatorTextMessage);
    }
}
