package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowAuthorization extends BaseTest {
    @Test
    public void windowAtuhorizationTest() {
        getAuthorization().buttonClickCss(getAuthorization().locatorButtonOpenLK);
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().titlewindow), "АВТОРИЗАЦИЯ");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorIconClose), "×");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().textNotification), "Если у вас ещё нет логина, зарегистрируйтесь");
        Assert.assertEquals(getAuthorization().getAttribute(getAuthorization().locatorFieldInputLogin, "placeholder"), "Логин или телефон");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().textButtonEnter), "Войти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().linkLosePassword), "Забыли пароль?");
    }
}
