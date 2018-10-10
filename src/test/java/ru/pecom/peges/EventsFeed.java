package ru.pecom.peges;

import org.openqa.selenium.WebDriver;

public class EventsFeed extends BasePage {
    public String openFeedEvent = ".buttonOpenNews";

    public EventsFeed(WebDriver driver) {
        super(driver);
    }

    public void openFeedEvents(){
        buttonClickCss(openFeedEvent);
    }
}
