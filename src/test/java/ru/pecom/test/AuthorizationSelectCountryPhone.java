package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AuthorizationSelectCountryPhone extends BaseTest{
    @Test
    public void testAuthorizationSelectCountryPhone(){
        SoftAssert asert = new SoftAssert();

        getAuthorization().openWindowAthorization();
        getAuthorization().inputFirstChar("+");
        Assert.assertTrue(getAuthorization().visibilitySelectCountryTel(),"Отсутствует кнопка выбора страны телефона");
        getAuthorization().openListSelectCountry();
        Assert.assertTrue(getAuthorization().checkCountryInList("Россия"),"В списке отсутствует страна Россия");
        Assert.assertTrue(getAuthorization().checkCountryInList("Казахстан"),"В списке отсутствует страна Казахстан");
        Assert.assertTrue(getAuthorization().checkCountryInList("Белоруссия"),"В списке отсутствует страна Белоруссия");
        getAuthorization().selectCountryPhone("Белоруссия");
        asert.assertEquals(getAuthorization().imgFlagCountry(),"http://192.168.111.62/img/flags/belarus.png");
        getAuthorization().openListSelectCountry();
        getAuthorization().selectCountryPhone("Россия");
        asert.assertEquals(getAuthorization().imgFlagCountry(),"http://192.168.111.62/img/flags/russia.png");
        getAuthorization().openListSelectCountry();
        getAuthorization().selectCountryPhone("Казахстан");
        asert.assertEquals(getAuthorization().imgFlagCountry(),"http://192.168.111.62/img/flags/kazakhstan.png");

        asert.assertAll();
    }
}
