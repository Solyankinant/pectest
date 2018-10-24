package ru.pecom.peges;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator))));
    }

    public void waitElementTextToBe(String locator, int timeOut, String text) {
        final WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.textToBePresentInElementValue(By.cssSelector(locator), text));
    }
    public void waitElementTextToBe(WebElement element, int timeOut, String text) {
        final WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
    }

    public void waitElementClickable(String locator, int timeOut) {
        final WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
    }

    public void waitElementInvisibility(String locator, int timeOut) {
        final WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions
                .invisibilityOfElementLocated(By.cssSelector(locator)));
    }

    public String getAttribute(String locatorCss, String attribute) {
        return driver.findElement(By.cssSelector(locatorCss)).getAttribute(attribute);
    }

    public String getPlaceholderField(String locator) {
        return getAttribute(locator, "placeholder");
    }


    public void buttonClickCss(String locator) {
        waitElementClickable(locator,5);
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void buttonClickXpath(String lotator) {
        driver.findElement(By.xpath(lotator)).click();
    }

    public void inputSendKeysCss(String locator, String text) {
        waitElementClickable(locator, 5);
        /*driver.findElement(By.cssSelector(locator)).clear();*/
        driver.findElement(By.cssSelector(locator)).sendKeys(text);
    }

    public void inputSendKeysXpath(String locator, String text) {
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public String getTextCss(String locator) {
        try {
            return driver.findElement(By.cssSelector(locator)).getText();
        }catch (NoSuchElementException e){
            return null;
        }
    }

    public String getTextXpath(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
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
            //System.out.println(list.get(4).getText());
            if (text.equals(list.get(i).getText())) {
                moveTo(list.get(i));
                return true;
            }
        }
        return false;
    }


    public boolean visibilityElementWait(String locator, int waitTime) {
        try {
            waitElement(locator, waitTime);
            return true;
        } catch (TimeoutException e) {
            return false;

        }
    }

    public boolean visibilityElement(String locator) {
        if (driver.findElements(By.cssSelector(locator)).size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean elementIsEnable(WebElement element) {
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    public String getUrlPage() {
        return driver.getCurrentUrl();
    }

    public void inputLogin(String locatorFieldInputLogin, String login) {
        for (int i = 0; i < login.length(); i++) {
            char sing = login.charAt(i);
            String singStr = Character.toString(sing);
            inputSendKeysCss(locatorFieldInputLogin, singStr);
            waitElementTextToBe(locatorFieldInputLogin, 1, singStr);
        }
    }

    public void inputPhone(String locatorFieldInput, String locatorFieldInputPhone, String phone) {
        char sing = phone.charAt(0);
        String singStr = Character.toString(sing);
        inputSendKeysCss(locatorFieldInput, singStr);
        if (singStr.contains("+")) {
            singStr = "+7";
        }
        if (singStr.contains("8")) {
            singStr = "+7";
        }
        if (singStr.contains("9")) {
            singStr = "+7";
        }
        if (singStr.contains("7")) {
            singStr = "+7";
        }
        if (singStr.contains("3")) {
            singStr = "+7";
        }
        waitElementTextToBe(locatorFieldInput, 1, singStr);
        waitElementClickable(locatorFieldInputPhone, 1);
        for (int i = 1; i < phone.length(); i++) {
            sing = phone.charAt(i);
            String singString = Character.toString(sing);
            inputSendKeysCss(locatorFieldInputPhone, singString);
            waitElementTextToBe(locatorFieldInputPhone, 1, singString);
        }
    }

    public void inputInField(String fieldInput, String textInput) {
        for (int i = 0; i < textInput.length(); i++) {
            char sing = textInput.charAt(i);
            String singStr = Character.toString(sing);
            inputSendKeysCss(fieldInput, singStr);
        }
    }




}