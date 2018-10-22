package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLoginLevelStandard extends BaseTest {


    @Test
    public void testAuthorizationLoginPecTest() {
        getAuthorization().openWindowAthorization();
        getAuthorization().inputLoginUser("pecomtest1");
        getAuthorization().inputPassword("pecomtest1");
        getAuthorization().clickButtonEnter();
        Assert.assertTrue(getAuthorization().visibleLkMenu(), "Не появилось личное меню пользователя");
        Assert.assertEquals(getAuthorization().getTextButtonLk(), "Выйти");
        Assert.assertEquals(getAuthorization().textLevelUser(), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
