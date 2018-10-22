package ru.pecom.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MenuTest extends BaseTest {

    @Test
    public void testHatSite() {

        SoftAssert asert = new SoftAssert();

        asert.assertTrue(getMenusite().visibleLogoSite(), "Logo отсутствует");
        asert.assertTrue(getMenusite().visibleCityUser(), "CityUser отсутствует");
        asert.assertTrue(getMenusite().ikonArrow(), "ikon Arrow отсутствует");
        asert.assertTrue(getMenusite().phoneDepartment(), "phone Department отсутствует");
        asert.assertEquals(getMenusite().capLinkBranchs(), "ФИЛИАЛЫ");
        asert.assertEquals(getMenusite().capLinkEvents(), "СОБЫТИЯ");
        asert.assertEquals(getMenusite().capButtonRequest(), "Подать заявку");
        asert.assertEquals(getMenusite().capButtonLK(), "Личный кабинет");
        asert.assertTrue(getMenusite().menuSiteList("БИЗНЕСУ"), "Отсутствует элемент меню БИЗНЕСУ");
        asert.assertTrue(getMenusite().menuSiteList("ЧАСТНЫМ ЛИЦАМ"), "Отсутствует элемент меню ЧАСТНЫМ ЛИЦАМ");
        asert.assertTrue(getMenusite().menuSiteList("НАПРАВЛЕНИЯ"), "Отсутствует элемент меню НАПРАВЛЕНИЯ");
        asert.assertTrue(getMenusite().menuSiteList("СЕРВИСЫ"), "Отсутствует элемент меню СЕРВИСЫ");
        asert.assertTrue(getMenusite().menuSiteList("УСЛУГИ"), "Отсутствует элемент меню УСЛУГИ");
        asert.assertTrue(getMenusite().menuSiteList("УСЛОВИЯ ПЕРЕВОЗКИ"), "Отсутствует элемент меню УСЛОВИЯ ПЕРЕВОЗКИ");
        asert.assertTrue(getMenusite().menuSiteList("ГОРЯЧАЯ ЛИНИЯ"), "Отсутствует элемент меню ГОРЯЧАЯ ЛИНИЯ");
        asert.assertTrue(getMenusite().menuSiteList("КАЛЬКУЛЯТОР"), "Отсутствует элемент меню КАЛЬКУЛЯТОР");

        asert.assertAll();

    }

}