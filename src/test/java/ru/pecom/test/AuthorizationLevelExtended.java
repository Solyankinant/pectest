package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLevelExtended extends BaseTest {

    @Test
    public void Authorization() {
        //openSitePec();
        getAuthorization().authorizationPecLk("pecomtest2","pecomtest2");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "РАСШИРЕННЫЙ");
        getAuthorization().exitLk();
        //closseBrauser();

    }

}