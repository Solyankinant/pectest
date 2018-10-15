package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AuthorizationFieldInput extends BaseTest{
    @Test
    public void testWindowAuthorizFild() {

        SoftAssert asert = new SoftAssert();

        getAuthorization().openWindowAthorization();
        getAuthorization().inputFirstChar("+");
        Assert.assertTrue(getAuthorization().visibilityFieldPassword());
        Assert.assertTrue(getAuthorization().visibilitySelectCountryTel());
        asert.assertEquals(getAuthorization().placeholderFieldPassword(),"Пароль");
        getAuthorization().closeWindowAuthorization();

        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().inputFirstChar("9");
        Assert.assertTrue(getAuthorization().visibilityFieldPassword());
        Assert.assertTrue(getAuthorization().visibilitySelectCountryTel());
        asert.assertEquals(getAuthorization().placeholderFieldPassword(),"Пароль");
        getAuthorization().closeWindowAuthorization();

        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().inputFirstChar("8");
        Assert.assertTrue(getAuthorization().visibilityFieldPassword());
        Assert.assertTrue(getAuthorization().visibilitySelectCountryTel());
        asert.assertEquals(getAuthorization().placeholderFieldPassword(),"Пароль");
        getAuthorization().closeWindowAuthorization();

        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().inputFirstChar("7");
        Assert.assertTrue(getAuthorization().visibilityFieldPassword());
        Assert.assertTrue(getAuthorization().visibilitySelectCountryTel());
        asert.assertEquals(getAuthorization().placeholderFieldPassword(),"Пароль");
        getAuthorization().closeWindowAuthorization();

        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().inputFirstChar("3");
        Assert.assertTrue(getAuthorization().visibilityFieldPassword());
        Assert.assertTrue(getAuthorization().visibilitySelectCountryTel());
        asert.assertEquals(getAuthorization().placeholderFieldPassword(),"Пароль");
        getAuthorization().closeWindowAuthorization();

        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().inputFirstChar("1");
        Assert.assertTrue(getAuthorization().visibilityFieldPassword());
        Assert.assertFalse(getAuthorization().visibilitySelectCountryTel());
        asert.assertEquals(getAuthorization().placeholderFieldPassword(),"Пароль");
        getAuthorization().closeWindowAuthorization();

        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        getAuthorization().inputFirstChar("f");
        Assert.assertTrue(getAuthorization().visibilityFieldPassword());
        Assert.assertFalse(getAuthorization().visibilitySelectCountryTel());
        asert.assertEquals(getAuthorization().placeholderFieldPassword(),"Пароль");
        getAuthorization().closeWindowAuthorization();

        asert.assertAll();
    }
}
