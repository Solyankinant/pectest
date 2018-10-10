package ru.pecom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class FloatingButtonsTest extends BaseTest{
    private String text = "Начать чат, мы онлайн!";
    @FindBy(css = ".lt-welcome .lt-chat-header")
    protected WebElement buttonSelectSizeList;
    @FindBy(css = ".wb_2")
    protected WebElement tet;


    @Test
    public void testFloatingButtons(){

        driver.findElement(By.cssSelector(".pm")).click();
        openStartPage();
        driver.findElement(By.cssSelector(".wb_2")).click();

        /*System.out.println(driver.findElement(By.cssSelector(".lt-welcome .lt-chat-header span")).getText());
        //Assert.assertEquals(driver.findElement(By.cssSelector(".lt-welcome .lt-chat-header span")).getText(),text);

        driver.findElement(By.cssSelector(".lt-wrapper-close")).click();*/






    }


}
