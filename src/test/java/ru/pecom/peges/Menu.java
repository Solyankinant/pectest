package ru.pecom.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu extends BasePage{

    private String locatorLinkBranchs = ".//i[@class=\"fas fa-map-marker-alt\"]/../span";
    private String locatorLinkEvents = ".buttonOpenNews span";
    private String locatorRequestButton = ".btn-secondary";
    private String locatorButtonLK = ".buttonOpenLK";
    private String locatorMenuSite = ".nav .nav-link";

    public Menu(WebDriver driver) {
        super(driver);
    }

    public boolean phoneDepartment() {
        driver.findElement(By.cssSelector(".phone-link"));
        return true;
    }

    public boolean ikonArrow() {
        driver.findElement(By.cssSelector(".fa-location-arrow"));
        return true;
    }

    public boolean visibleCityUser() {
        driver.findElement(By.cssSelector(".city-name"));
        return true;
    }

    public boolean visibleLogoSite() {
        driver.findElement(By.cssSelector(".logo"));
        return true;
    }

    public String capLinkBranchs(){
        return getTextXpath(locatorLinkBranchs);
    }

    public String capLinkEvents(){
        return getTextCss(locatorLinkEvents);
    }

    public String capButtonRequest(){
        return getTextCss(locatorRequestButton);
    }

    public String capButtonLK(){
        return getTextCss(locatorButtonLK);
    }

    public boolean menuSiteList(String elementMenu){
        return comparisonElementList(locatorMenuSite, elementMenu);
    }


}
