package ru.pecom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FloatingButtonsTest extends BaseTest{

    @Test
    public void testFloatingButtons(){

        SoftAssert asert = new SoftAssert();
        asert.assertTrue(getFloatButtons().presentButtonChat(),"Отсутствует кнопка Онлайн чат");
        asert.assertTrue(getFloatButtons().presentButtonConsultant(),"Отсутствует кнопка Персональный менеджер");
        asert.assertEquals(getFloatButtons().imgButtonChat(),"http://192.168.111.62/img/fixed_buttons/online.png");
        asert.assertEquals(getFloatButtons().imgButtonConsultant(),"https://pecom.ru/img/pers_man/icon_pm.png");
        getFloatButtons().clickButtonOnlainChat();
        getFloatButtons().selectWindow();
        asert.assertEquals(getFloatButtons().nameChat(),"Начать чат, мы онлайн!");
        asert.assertEquals(getFloatButtons().textWelcomChat(),"Добрый день! Чем могу Вам помочь?");
        getFloatButtons().closeChat();
        getFloatButtons().clickButtonConsultant();
        asert.assertEquals(getFloatButtons().getUrlPage(),"https://pecom.ru/contacts/pers_man/");
        openStartPage();
        getAuthorization().authorizationLoginPecLk();
        asert.assertFalse(getFloatButtons().presentButtonChat(),"Пользователь авторизован, присутствует кнопка Онлайн чат");
        asert.assertTrue(getFloatButtons().presentButtonConsultant(),"Отсутствует кнопка Персональный менеджер");
        asert.assertEquals(getFloatButtons().imgButtonConsultant(),"https://pecom.ru/img/pers_man/icon_pm.png");
        getFloatButtons().clickButtonConsultant();
        asert.assertEquals(getFloatButtons().getUrlPage(),"https://pecom.ru/contacts/pers_man/");


        asert.assertAll();

    }


}
