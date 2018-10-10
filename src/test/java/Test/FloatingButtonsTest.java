package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FloatingButtonsTest extends BaseTest{
    private String text = "Начать чат, мы онлайн!";
    @FindBy(css = ".lt-welcome .lt-chat-header")
    protected WebElement buttonSelectSizeList;
    @FindBy(css = ".wb_2")
    protected WebElement tet;


    @Test
    public void testFloatingButtons(){
        //openSitePec();
        driver.findElement(By.cssSelector(".pm")).click();
        openStartPage();
        driver.findElement(By.cssSelector(".wb_2")).click();

        /*System.out.println(driver.findElement(By.cssSelector(".lt-welcome .lt-chat-header span")).getText());
        //Assert.assertEquals(driver.findElement(By.cssSelector(".lt-welcome .lt-chat-header span")).getText(),text);

        driver.findElement(By.cssSelector(".lt-wrapper-close")).click();*/
        //closseBrauser();




    }


}
