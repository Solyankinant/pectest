package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLoginLevelStandard extends BaseTest {
    private String login = "ecomtest1";

    @Test
    public void AuthorizationPecTest(){
        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().authorizationPecLk(getAuthorization().locatorFieldInputLogin,"p", login, "pecomtest1");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonOpenLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
