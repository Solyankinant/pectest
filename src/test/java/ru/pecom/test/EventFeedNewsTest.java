package ru.pecom.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EventFeedNewsTest extends BaseTest{
    @Test
    public void eventFeedNews(){

        SoftAssert asert = new SoftAssert();
        asert.assertTrue(getEventsFeed().visibleButtonEvents(),"Кнопка СОБЫТИЯ не найдена");
        getEventsFeed().openFeedEvents();
        asert.assertTrue(getEventsFeed().comparisonNameEvent("Новости"),"Авторизации нет.Отсутвуют события типа Новости");
        asert.assertFalse(getEventsFeed().comparisonNameEvent("Грузы/Заявки"),"Авторизации нет. Присутвуют события типа Грызы/Заявки");
        asert.assertFalse(getEventsFeed().comparisonNameEvent("Управление доверенностями"),"Авторизации нет. Присутвуют события типа Управление доверенностями");
        asert.assertFalse(getEventsFeed().comparisonNameEvent("Обратная связь"), "Авторизации нет. Присутвуют события типа Обратная связь");
        getAuthorization().openWindowAthorization();
        getAuthorization().authorizationLoginPecLk();
        asert.assertTrue(getEventsFeed().visibleButtonEvents(),"Кнопка СОБЫТИЯ не найдена");
        getEventsFeed().openFeedEvents();
        asert.assertTrue(getEventsFeed().comparisonNameEvent("Новости"),"Отсутвуют события типа Новости");
        asert.assertTrue(getEventsFeed().comparisonNameEvent("Грузы/Заявки"),"Отсутвуют события типа Грызы/Заявки");
        asert.assertTrue(getEventsFeed().comparisonNameEvent("Управление доверенностями"),"Отсутвуют события типа Управление доверенностями");
        asert.assertTrue(getEventsFeed().comparisonNameEvent("Обратная связь"), "Отсутвуют события типа Обратная связь");

        asert.assertAll();

    }
}
