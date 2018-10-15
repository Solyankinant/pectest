package ru.pecom.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveTo(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void waitClick(WebElement locator, WebDriver driver, int timeout) {
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(locator)));
        locator.click();
    }

    public void waitElement(String locator, int timeOut) {
        final WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public String getAttribute(String locatorCss, String attribute) {
        return driver.findElement(By.cssSelector(locatorCss)).getAttribute(attribute);
    }

    public String placeholderField(String locator) {
        return getAttribute(locator, "placeholder");
    }


    public void buttonClickCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void buttonClickXpath(String lotator) {
        driver.findElement(By.xpath(lotator)).click();
    }

    public void inputSendKeysCss(String locator, String text) {
        driver.findElement(By.cssSelector(locator)).sendKeys(text);
    }

    public void inputSendKeysXpath(String locator, String text) {
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public String getTextCss(String locator) {
        return driver.findElement(By.cssSelector(locator)).getText();
    }

    public void clickButtonElementList(String locatorCss, String textSelect) {
        List<WebElement> list = driver.findElements(By.cssSelector(locatorCss));
        for (int i = 0; i < list.size(); i++) {
            if (textSelect.equals(list.get(i).getText())) {
                list.get(i).click();
                break;
            }
        }
    }

    public boolean comparisonElementList(String locatorCss, String text) {
        List<WebElement> list = driver.findElements(By.cssSelector(locatorCss));
        for (int i = 0; i < list.size(); i++) {
            if (text.equals(list.get(i).getText())) {
                return true;
            }
        }
        return false;
    }

    public boolean visibilityElement(String locator) {
        try {
            waitElement(locator, 5);
            return true;
        } catch (TimeoutException e) {
            return false;

        }
    }


}