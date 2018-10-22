package ru.pecom.test;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class FildSearchTest extends BaseTest {


    @Test
    public void testFildSearch() {

        SoftAssert asert = new SoftAssert();
        asert.assertEquals(getFieldSearchCargoInMenu().textPlaceholderFild(),"МВКОБЖШ-1/1808");
        getFieldSearchCargoInMenu().clickLupaIkon();
        asert.assertTrue(getFieldSearchCargoInMenu().visibleInListCod(),"В выпадающем списке не отображаются коды");
        asert.assertTrue(getFieldSearchCargoInMenu().visibleInListPath(),"В выпадающем списке не отображаются направления грузов");
        getFieldSearchCargoInMenu().inputCodeCargoInFieldSearch("13");
        asert.assertTrue(getFieldSearchCargoInMenu().matchTextSelection("13"),"Ошибка в выделении совпадения в выпадающем списке");
        getFieldSearchCargoInMenu().cleanFildSearch();
        getFieldSearchCargoInMenu().inputCodeCargoInFieldSearch("ММММ");
        asert.assertFalse(getFieldSearchCargoInMenu().matchTextSelection("ММММ"),"Ошибка, совпадений в списке не должно быть");
        getFieldSearchCargoInMenu().cleanFildSearch();
        getFieldSearchCargoInMenu().inputCodeCargoInFieldSearch("МВУСМЗЖ-1/1304");
        getFieldSearchCargoInMenu().clickLupaIkon();
        asert.assertTrue(getFieldSearchCargoInMenu().resultSearchCargo(),"Поиск по коду невыполнен");
        getFieldSearchCargoInMenu().clickInFildSearch();
        getFieldSearchCargoInMenu().inputCodeCargoInFieldSearch("МВУСМЗЖ-1/1304");
        getFieldSearchCargoInMenu().pressKeyEnter();
        asert.assertTrue(getFieldSearchCargoInMenu().resultSearchCargo(),"Поиск по коду невыполнен");
        getFieldSearchCargoInMenu().cleanFildSearch();
        getFieldSearchCargoInMenu().clickInFildSearch();
        getFieldSearchCargoInMenu().inputCodeCargoInFieldSearch("МВРТГРШ-3/2011");
        getFieldSearchCargoInMenu().pressKeyEnter();
        asert.assertEquals(getFieldSearchCargoInMenu().textErrorCargoIsNotFound(),"Ошибка! Запрашиваемые вами грузы не найдены: МВРТГРШ-3/2011");


        asert.assertAll();
    }
}
