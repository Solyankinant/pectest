package ru.pecom.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EventsFeed extends BasePage {
    public String openFeedEvent = ".buttonOpenNews";
    private String locatorNameTypeEvent = ".news-item p:nth-child(1)";

    public EventsFeed(WebDriver driver) {
        super(driver);
    }

    public void openFeedEvents(){
        buttonClickCss(openFeedEvent);
    }

    public boolean visibleButtonEvents(){
        waitElementClickable(openFeedEvent,5);
        return visibilityElementWait(openFeedEvent,5);
    }

    public boolean comparisonNameEvent(String nameEvent){
        List<WebElement> list = driver.findElements(By.cssSelector(locatorNameTypeEvent));
        for (int i = 0; i < list.size(); i++) {
            moveTo(list.get(i));
            if (nameEvent.equals(list.get(i).getText())) {
                return true;
            }
        }
        return false;
    }



}
