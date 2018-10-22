package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLoginLevelExtended extends BaseTest {


    @Test
    public void testAuthorizationLoginTest() {
        getAuthorization().openWindowAthorization();
        getAuthorization().inputLoginUser("pecomtest2");
        getAuthorization().inputPassword("pecomtest2");
        getAuthorization().clickButtonEnter();
        Assert.assertTrue(getAuthorization().visibleLkMenu(), "Не появилось личное меню пользователя");
        Assert.assertEquals(getAuthorization().getTextButtonLk(), "Выйти");
        getAuthorization().exitLk();
    }

}