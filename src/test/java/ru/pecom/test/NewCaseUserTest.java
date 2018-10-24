package ru.pecom.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewCaseUserTest extends BaseTest{

    @Test
    public void testNewCaseUser() {
        SoftAssert asert = new SoftAssert();
        getAuthorization().authorizationLoginPecLk();
        getLkContent().clickElementMenu("Обратная связь");
        getFeedbackPage().clickButtonNewMessage();
        asert.assertEquals(getNewCasePage().titleWindow(),"НОВОЕ ОБРАЩЕНИЕ");
        asert.assertEquals(getNewCasePage().textThem(),"Тема");
        asert.assertEquals(getNewCasePage().textTitleFieldMessage(),"Текст сообщения");
        asert.assertEquals(getNewCasePage().textNotify(),"до 5 файлов размером не более 2 мб каждый");
        asert.assertTrue(getNewCasePage().ikonCloseWindow(),"Отсутствует иконка Х ");
        asert.assertTrue(getNewCasePage().linkAttachment(),"Отсутствует ссылка приложения файла");
        asert.assertTrue(getNewCasePage().presentButtonSend(),"Отсутствует кнопка Отправить");
        getNewCasePage().closeWindowNewMessage();
        asert.assertTrue(getNewCasePage().invisibleWindow(),"Окно нового сообщения не закрылось");
        getFeedbackPage().clickButtonNewMessage();
        getNewCasePage().clickButtonSendMessage();
        asert.assertEquals(getNewCasePage().textErrorTheme(),"Обязательное поле");
        asert.assertEquals(getNewCasePage().textErrorMessageText(),"Обязательное поле");
        getNewCasePage().selectTheme("Статус груза2");
        getNewCasePage().inputTextMessage("Чтобы проверить поддерживает ли список множественный выбор, " +
                "можно использовать метод — isMultiple(). Он возвращает boolean значение, " +
                "основанное на атрибуте \"multiple\" тега SELECT.");
        getNewCasePage().clickButtonSendMessage();
        asert.assertTrue(getNewCasePage().invisibleWindow(),"Окно нового сообщения не закрылось");
        asert.assertEquals(getFeedbackPage().themeFirstMessage(),"Статус груза2");
        asert.assertEquals(getFeedbackPage().textFirstMessage(),("Чтобы проверить поддерживает ли список множественный выбор, " +
                "можно использовать метод — isMultiple(). Он возвращает boolean значение, " +
                "основанное на атрибуте \"multiple\" тега SELECT."));
        asert.assertAll();
    }
}
