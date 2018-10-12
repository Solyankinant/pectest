package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.pecom.test.BaseTest;

public class AuthorizationLoginLevelExtended extends BaseTest {
    private String login = "ecomtest2";

    @Test
    public void AuthorizationTest() {
        getAuthorization().buttonClickCss(getAuthorization().locatorButtonLK);
        getAuthorization().authorizationPecLk(getAuthorization().locatorFieldLogin,"p", login,"pecomtest2");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "РАСШИРЕННЫЙ");
        getAuthorization().exitLk();

    }

}