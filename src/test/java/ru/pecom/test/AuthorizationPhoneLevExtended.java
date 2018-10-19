package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationPhoneLevExtended extends BaseTest {


    @Test
    public void AuthorizationPhoneTest() {
        getAuthorization().openWindowAthorization();
        getAuthorization().inputPhoneUser("89876543210");
        getAuthorization().inputPassword("pecomtest2");
        getAuthorization().clickButtonEnter();
        Assert.assertTrue(getAuthorization().visibleLkMenu(), "Не появилось личное меню пользователя");
        Assert.assertEquals(getAuthorization().getTextButtonLk(), "Выйти");
        getAuthorization().exitLk();
    }
}