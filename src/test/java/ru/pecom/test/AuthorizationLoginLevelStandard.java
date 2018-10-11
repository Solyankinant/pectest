package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.pecom.test.BaseTest;

public class AuthorizationLoginLevelStandard extends BaseTest {
    private String login = "pecomtest1";

    @Test
    public void AuthorizationPecTest(){

        getAuthorization().authorizationPecLk(login, "pecomtest1");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
