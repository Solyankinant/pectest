package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationPhoneLevStandard extends BaseTest {
    private String phone = "8005553535";
    @Test
    public void AuthorizationPhoneTest(){

        getAuthorization().buttonClickCss(getAuthorization().locatorButtonLK);
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().titlewindow), "АВТОРИЗАЦИЯ");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().textNotification), "Если у вас ещё нет логина, зарегистрируйтесь");
        getAuthorization().authorizationPecLk(getAuthorization().filedInputPhone,"9",phone, "pecomtest1");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();

    }
}
