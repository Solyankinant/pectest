package ru.pecom.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FieldsWindowRecoveryPasswordTest extends BaseTest {
    @Test
    public void testWindowRecoveryPassword(){
        SoftAssert asert = new SoftAssert();
        getAuthorization().openWindowRecoveryPassword();
        asert.assertEquals(getRecoveryPassword().textTitle(),"ВОССТАНОВЛЕНИЕ ПАРОЛЯ");
        asert.assertEquals(getRecoveryPassword().textNotify(),"Код для восстановления пароля будет отправлен вам на почту или телефон, указанные при регистрации.");
        asert.assertTrue(getRecoveryPassword().presentIkonCloseWindow(),"Не отображается иконка закрытия окна");
        asert.assertEquals(getRecoveryPassword().textLinkNotLogin(),"Не помню логин");
        asert.assertEquals(getRecoveryPassword().textPlaceholderField(),"Телефон или логин");
        asert.assertTrue(getRecoveryPassword().buttonNext.isEnabled(),"Не отображается кнопка Далее");
        asert.assertEquals(getRecoveryPassword().buttonNext.getText(),"Далее");
        getRecoveryPassword().buttonNext.click();
        asert.assertEquals(getRecoveryPassword().textError(),"Обязательное поле");
        getRecoveryPassword().linkNotLogin.click();
        asert.assertEquals(getRecoveryPassword().textNotify(),"Код для восстановления пароля и логин будут отправлены вам на почту, указанную при регистрации.");
        asert.assertEquals(getRecoveryPassword().textPlaceholderField(),"E-mail");
        getRecoveryPassword().buttonNext.click();
        asert.assertEquals(getRecoveryPassword().textError(),"Обязательное поле");
        getRecoveryPassword().buttonCloseWindow.click();
        asert.assertAll();

    }
}
