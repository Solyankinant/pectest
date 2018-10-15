package ru.pecom.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }



    /*public PageCompariGoods(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }*/

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
        final WebDriverWait wait = new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
        //locator.click();
    }

    public String getAttribute(String locatorCss, String attribute){
        return driver.findElement(By.cssSelector(locatorCss)).getAttribute(attribute);
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

    public  String  getTextCss(String locator){
        return driver.findElement(By.cssSelector(locator)).getText();
    }

}