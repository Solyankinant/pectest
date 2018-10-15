package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLoginLevelExtended extends BaseTest {
    private String login = "ecomtest2";

    @Test
    public void AuthorizationTest() {
        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().authorizationPecLk(getAuthorization().locatorFieldInputLogin,"p", login,"pecomtest2");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonOpenLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "РАСШИРЕННЫЙ");
        getAuthorization().exitLk();

    }

}