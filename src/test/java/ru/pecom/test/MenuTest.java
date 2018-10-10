package ru.pecom.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MenuTest extends BaseTest {
    private String testEvents = "СОБЫТИЯ";
    private String testBranches = "ФИЛИАЛЫ";
    private String testRequestButton = "Подать заявку";
    private String testButtonAuthoriz = "Личный кабинет";
    private String text = "БИЗНЕСУ\n" +
            "ЧАСТНЫМ ЛИЦАМ\n" +
            "НАПРАВЛЕНИЯ\n" +
            "СЕРВИСЫ\n" +
            "УСЛУГИ\n" +
            "УСЛОВИЯ ПЕРЕВОЗКИ\n" +
            "ГОРЯЧАЯ ЛИНИЯ\n" +
            "КАЛЬКУЛЯТОР\n" +
            "МВКОБЖШ-1/1808";


    @Test
    public void HatSite() {


        driver.findElement(By.cssSelector(".logo"));
        driver.findElement(By.cssSelector(".city-name"));
        driver.findElement(By.cssSelector(".fa-location-arrow"));
        driver.findElement(By.cssSelector(".phone-link"));
        Assert.assertEquals(driver.findElement(By.xpath(".//i[@class=\"fas fa-map-marker-alt\"]/../span")).getText(), testBranches);
        Assert.assertEquals(driver.findElement(By.cssSelector(".buttonOpenNews span")).getText(), testEvents);
        Assert.assertEquals(driver.findElement(By.cssSelector(".btn-secondary")).getText(), testRequestButton);
        Assert.assertEquals(driver.findElement(By.cssSelector(".buttonOpenLK")).getText(), testButtonAuthoriz);
        Assert.assertEquals(driver.findElement(By.cssSelector(".bottom-nav")).getText(), text);
//        System.out.println(driver.findElement(By.cssSelector(".top-nav")).getText());




    }

}
