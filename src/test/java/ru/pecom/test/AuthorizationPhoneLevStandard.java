package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationPhoneLevStandard extends BaseTest {


    @Test
    public void AuthorizationPhoneTest() {

        getAuthorization().openWindowAthorization();
        getAuthorization().authorizationPecLk(getAuthorization().filedInputPhone, "9", "8005553535", "pecomtest1");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonOpenLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
