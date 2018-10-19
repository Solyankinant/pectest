package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationPhoneLevStandard extends BaseTest {


    @Test
    public void AuthorizationPhoneTest() {
        getAuthorization().openWindowAthorization();
        getAuthorization().inputPhoneUser("88005553535");
        getAuthorization().inputPassword("pecomtest1");
        getAuthorization().clickButtonEnter();
        Assert.assertTrue(getAuthorization().visibleLkMenu(), "Не появилось личное меню пользователя");
        Assert.assertEquals(getAuthorization().getTextButtonLk(), "Выйти");
        Assert.assertEquals(getAuthorization().textLevelUser(), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
