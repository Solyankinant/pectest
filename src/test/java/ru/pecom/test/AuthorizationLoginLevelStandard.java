package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLoginLevelStandard extends BaseTest {


    @Test
    public void AuthorizationPecTest() {
        getAuthorization().openWindowAthorization();
        getAuthorization().authorizationPecLk(getAuthorization().locatorFieldInputLogin, "p", "ecomtest1", "pecomtest1");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonOpenLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
