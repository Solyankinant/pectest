package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLoginLevelExtended extends BaseTest {


    @Test
    public void AuthorizationTest() {
        getAuthorization().openWindowAthorization();
        getAuthorization().authorizationPecLk(getAuthorization().locatorFieldInputLogin, "p", "ecomtest2", "pecomtest2");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonOpenLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "РАСШИРЕННЫЙ");
        getAuthorization().exitLk();

    }

}