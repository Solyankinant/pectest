package ru.pecom.peges;

import org.openqa.selenium.WebDriver;

public class FieldSearchCargoInMenu extends BasePage {
    //WebDriver driver;
    private String locatorLupaInFieldSearch = ".lupa";
    private String locatorFieldSearchCargo = ".myinput";
    private String loactorResultSearchCargo = ".cargo-content-block";
    private String codeCargo = "МВУСМЗЖ-1/1304";

    public FieldSearchCargoInMenu(WebDriver driver) {
        super(driver);

    }

    public void inputCodeCargoInFieldSearch(){
        buttonClickCss(locatorLupaInFieldSearch);
        inputSendKeysCss(locatorFieldSearchCargo,codeCargo);
        buttonClickCss(locatorLupaInFieldSearch);

    }

    public void resultSearchCargo(){
        waitElement(loactorResultSearchCargo,15);

    }




}

