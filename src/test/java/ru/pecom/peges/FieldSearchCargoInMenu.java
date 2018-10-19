package ru.pecom.peges;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FieldSearchCargoInMenu extends BasePage {

    protected String locatorLupaInFieldSearch = ".lupa";
    protected String locatorFieldSearchCargo = ".myinput";
    protected String loactorResultSearchCargo = ".cargo-content-block";
    protected String locatorPlaceholderFild = ".holder";
    protected String locatorListSelection = ".item b";
    protected String locatorCodInList = ".item";
    protected String locatorPathInListCargo = ".dest";
    protected String locatorError = ".alert-warning b";
    protected String locatorTextErrorSearch = ".alert-warning p:nth-child(2)";
    @FindBy(css = ".input-group-sm")
    protected WebElement fildSearch;


    public FieldSearchCargoInMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public String textPlaceholderFild() {
        return getTextCss(locatorPlaceholderFild);
    }


    public void inputCodeCargoInFieldSearch(String codeCargo) {
        inputSendKeysCss(locatorFieldSearchCargo, codeCargo);
    }

    public void clickLupaIkon() {
        buttonClickCss(locatorLupaInFieldSearch);
    }

    public void clickInFildSearch() {
        fildSearch.click();
    }

    public boolean resultSearchCargo() {
        return visibilityElementWait(loactorResultSearchCargo, 15);

    }

    public boolean matchTextSelection(String textInput) {
        return comparisonElementList(locatorListSelection, textInput);
    }

    public void cleanFildSearch() {
        driver.findElement(By.cssSelector(locatorFieldSearchCargo)).clear();
    }

    public void pressKeyEnter() {
        driver.findElement(By.cssSelector(locatorFieldSearchCargo)).sendKeys(Keys.ENTER);
    }

    public boolean visibleInListCod() {
        return visibilityElement(locatorCodInList);
    }

    public boolean visibleInListPath() {
        return visibilityElement(locatorPathInListCargo);
    }

    public String textErrorCargoIsNotFound() {
        waitElement(locatorTextErrorSearch, 15);
        return getTextCss(locatorError) + " " + getTextCss(locatorTextErrorSearch);

    }




}

