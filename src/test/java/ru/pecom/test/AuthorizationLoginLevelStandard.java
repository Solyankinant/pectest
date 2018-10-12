package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.pecom.test.BaseTest;

public class AuthorizationLoginLevelStandard extends BaseTest {
    private String login = "ecomtest1";

    @Test
    public void AuthorizationPecTest(){
        getAuthorization().buttonClickCss(getAuthorization().locatorButtonLK);
        getAuthorization().authorizationPecLk(getAuthorization().locatorFieldLogin,"p", login, "pecomtest1");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
