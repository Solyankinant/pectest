package ru.pecom.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.SplittableRandom;

public class LKContent extends BasePage {

    private String locatorBlockLevelAlert = ".block-level p";
    private String locatorTextLevelUser = ".block-level span";
    private String locatorButtonUpLevel = ".block-level button";
    private String locatorElementsMenuLK = ".list-unstyled span";
    private String locatorButtonMinimaseLk = ".bottom-block";
    private String locatorLkSmallVersion = ".small";
    private String locatorAvatar = ".avatar img";
    private String locatorWindowUpLevel = ".modal-content";
    private String locatorCloseWindowUpLevel = ".modal-header button";
    private String locatorIkonGear = ".info i";
    private String locatorFullName = ".info p";
    private String textTittlePage = ".container h1:nth-child(2)";
    private String locatorActiveElementMenu = ".nav-block .active";



    public LKContent(WebDriver driver) {
        super(driver);
    }

    public String textBlockLevel() {
        return (getTextCss(locatorBlockLevelAlert) + " " + getTextCss(locatorTextLevelUser));

    }

    public boolean buttonUpLevel() {
        return visibilityElementWait(locatorButtonUpLevel, 5);
    }

    public Boolean elementsMenuLk(String elementMenuLk){
        return comparisonElementList(locatorElementsMenuLK,elementMenuLk);
    }

    public boolean buttonMinimaseLk(String textLink){
        return comparisonElementList(locatorButtonMinimaseLk,textLink);
    }

    public boolean smallLk(){
        return visibilityElementWait(locatorLkSmallVersion,1);
    }

    public void rollUpMenuLk(){
        buttonClickCss(locatorButtonMinimaseLk);
    }

    public boolean avatar(){
        return visibilityElementWait(locatorAvatar,5);
    }

    public boolean checkOpenWindowUpLevel(){
        if (visibilityElement(locatorWindowUpLevel)){
            return true;
        } else return false;
    }

    public void clickButtonUpLevel(){
        buttonClickCss(locatorButtonUpLevel);
    }

    public void closeWindowUpLevel(){
        buttonClickCss(locatorCloseWindowUpLevel);
    }

    public void clickElementMenu(String selectElement){
        clickButtonElementList(locatorElementsMenuLK, selectElement);
    }

    public void clickIkonGear(){
        buttonClickCss(locatorIkonGear);
    }

    public void clickAvatar(){
        buttonClickCss(locatorAvatar);
    }

    public void clickFullNameUser(){
        buttonClickCss(locatorIkonGear);
    }

    public String getTextTittlePage(){
        return getTextCss(textTittlePage);
    }

    public String getTextActiveElementMenuLk(){
        return getTextCss(locatorActiveElementMenu);
    }



}
