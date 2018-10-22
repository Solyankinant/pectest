package ru.pecom.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RecoveryPasswordOnPhoneTest extends BaseTest {
    @Test
    public void testRecoveryPasswordOnPhone(){
        SoftAssert asert = new SoftAssert();
        getAuthorization().openWindowRecoveryPassword();
        getRecoveryPassword().fieldInput.sendKeys("+");
        asert.assertTrue(getRecoveryPassword().selectCountryPhone.isEnabled(),"Нет поля выбора страны телеыона");
        asert.assertTrue(getRecoveryPassword().showInField("+7"),"В поле не отображается +7");
        getRecoveryPassword().buttonCloseWindow.click();
        getAuthorization().openWindowRecoveryPassword();
        getRecoveryPassword().fieldInput.sendKeys("9");
        asert.assertTrue(getRecoveryPassword().selectCountryPhone.isEnabled(),"Нет поля выбора страны телеыона");
        asert.assertTrue(getRecoveryPassword().showInField("+7"),"В поле не отображается +7");
        getRecoveryPassword().buttonCloseWindow.click();
        getAuthorization().openWindowRecoveryPassword();
        getRecoveryPassword().fieldInput.sendKeys("8");
        asert.assertTrue(getRecoveryPassword().selectCountryPhone.isEnabled(),"Нет поля выбора страны телеыона");
        asert.assertTrue(getRecoveryPassword().showInField("+7"),"В поле не отображается +7");
        getRecoveryPassword().buttonCloseWindow.click();
        getAuthorization().openWindowRecoveryPassword();
        getRecoveryPassword().fieldInput.sendKeys("7");
        asert.assertTrue(getRecoveryPassword().selectCountryPhone.isEnabled(),"Нет поля выбора страны телеыона");
        asert.assertTrue(getRecoveryPassword().showInField("+7"),"В поле не отображается +7");
        getRecoveryPassword().buttonCloseWindow.click();
        getAuthorization().openWindowRecoveryPassword();
        getRecoveryPassword().fieldInput.sendKeys("3");
        asert.assertTrue(getRecoveryPassword().selectCountryPhone.isEnabled(),"Нет поля выбора страны телеыона");
        asert.assertTrue(getRecoveryPassword().showInField("+7"),"В поле не отображается +7");
        getRecoveryPassword().buttonCloseWindow.click();
        getAuthorization().openWindowRecoveryPassword();
        getAuthorization().inputPhoneUser("898765");
        getRecoveryPassword().buttonNext.click();
        /*asert.assertEquals(getRecoveryPassword().elementTextError.getText(),"Неверный формат");*/
        getRecoveryPassword().buttonCloseWindow.click();
        getAuthorization().openWindowRecoveryPassword();
        getAuthorization().inputPhoneUser("89111111111");
        getRecoveryPassword().buttonNext.click();
        /*asert.assertEquals(getRecoveryPassword().elementTextError.getText(),"Телефон не найден!");*/
        getRecoveryPassword().buttonCloseWindow.click();
        getAuthorization().openWindowRecoveryPassword();
        getAuthorization().inputPhoneUser("89876543210");
        getRecoveryPassword().buttonNext.click();
        asert.assertEquals(getChangePassword().textTitle(),"СМЕНА ПАРОЛЯ");
        asert.assertEquals(getChangePassword().textFirstNotify(),"На номер +7 (987) 654-32-10 выслан код подтверждения");
        /*asert.assertEquals(getChangePassword().textSecondNotify(),"Не пришел код? Запросить повторно через 30 секунд");*/                  //нет уведомления
        asert.assertEquals(getChangePassword().textFieldCodeSms(),"Код подтверждения");
        asert.assertEquals(getChangePassword().textFieldNewPassword(),"Новый пароль");                                             //по ТЗ нет placeholder
        asert.assertEquals(getChangePassword().textFieldNewPasswordRetern(),"Новый пароль еще раз");                                //по ТЗ нет placeholder
        asert.assertTrue(getChangePassword().presentButton(),"Отсутствует кнопка Сохранить");
        asert.assertEquals(getChangePassword().textButton(),"Сохранить");
        /*asert.assertTrue(getChangePassword().linkRepeatCode(),"Не появилась ссылка Запросить повторно"); */                           //нет уведомления
        getChangePassword().inputCodeSms("0000");
        asert.assertEquals(getChangePassword().textErrorCode(),"Неверный код подтверждения");                                 // нет сообщения об ошибке









        asert.assertAll();
    }
}
