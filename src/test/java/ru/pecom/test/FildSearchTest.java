package ru.pecom.test;


import org.testng.annotations.Test;


public class FildSearchTest extends BaseTest {


    @Test
    public void fildSearch() {
        //openSitePec();
        getFieldSearchCargoInMenu().inputCodeCargoInFieldSearch();
        getFieldSearchCargoInMenu().resultSearchCargo();
        //closseBrauser();

    }
}
