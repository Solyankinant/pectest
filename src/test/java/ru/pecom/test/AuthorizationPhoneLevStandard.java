package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationPhoneLevStandard extends BaseTest {
    private String phone = "8005553535";
    @Test
    public void AuthorizationPhoneTest(){

        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().authorizationPecLk(getAuthorization().filedInputPhone,"9",phone, "pecomtest1");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonOpenLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
