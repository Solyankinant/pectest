package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationPhoneLevExtended extends BaseTest{
    String phone = "876543210";
    @Test
    public void AuthorizationPhoneTest(){
        getAuthorization().buttonClickCss(getAuthorization().locatorButtonLK);
        getAuthorization().authorizationPecLk(getAuthorization().filedInputPhone,"9",phone,"pecomtest2");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "РАСШИРЕННЫЙ");
        getAuthorization().exitLk();
    }
}
