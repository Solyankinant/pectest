package ru.pecom.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LKContentLevelStandartTest extends BaseTest {
    @Test
    public void testLkContentLevelStandart(){

        SoftAssert asert = new SoftAssert();
        getAuthorization().openWindowAthorization();
        getAuthorization().authorizationLoginPecLk();
        asert.assertTrue(getLkContent().avatar(),"Отсутствует img аватара user");
        asert.assertEquals(getLkContent().textBlockLevel(),"Ваш уровень доступа: СТАНДАРТНЫЙ", "Ошибка, уведомление об уровне доступа пользователя");
        asert.assertTrue(getLkContent().buttonUpLevel(),"Отсутствует кнопка повышения уровня доступа");

        getLkContent().clickButtonUpLevel();
        asert.assertTrue(getLkContent().checkOpenWindowUpLevel(),"Не открывается окно получения полного доступа");
        getLkContent().closeWindowUpLevel();

        asert.assertTrue(getLkContent().elementsMenuLk("Подать заявку"), "В меню ЛК отсутствует элемент Подать заявку");
        /*getLkContent().clickElementMenu("Подать заявку");
        asert.assertEquals(getLkContent().getTextActiveElementMenuLk(),"Подать заявку");
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Подать заявку","Открылась страница с несоответствующим заголовком");*/

        asert.assertTrue(getLkContent().elementsMenuLk("Мои грузы"), "В меню ЛК отсутствует элемент Мои грузы");
        getLkContent().clickElementMenu("Мои грузы");
        asert.assertEquals(getLkContent().getTextActiveElementMenuLk(),"Мои грузы");
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/cargo","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Мои грузы","Открылась страница с несоответствующим заголовком");
        getLkContent().clickAvatar();
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/profile","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Профиль","Открылась страница с несоответствующим заголовком");

        asert.assertTrue(getLkContent().elementsMenuLk("Мои заявки"), "В меню ЛК отсутствует элемент Мои заявки");
        getLkContent().clickElementMenu("Мои заявки");
        asert.assertEquals(getLkContent().getTextActiveElementMenuLk(),"Мои заявки");
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/orders","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Мои заявки","Открылась страница с несоответствующим заголовком");
        getLkContent().clickFullNameUser();
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/profile","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Профиль","Открылась страница с несоответствующим заголовком");

        asert.assertTrue(getLkContent().elementsMenuLk("Обратная связь"), "В меню ЛК отсутствует элемент Обратная связь");
        getLkContent().clickElementMenu("Обратная связь");
        asert.assertEquals(getLkContent().getTextActiveElementMenuLk(),"Обратная связь");
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/feedback","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Обратная связь","Открылась страница с несоответствующим заголовком");
        getLkContent().clickIkonGear();
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/profile","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Профиль","Открылась страница с несоответствующим заголовком");

        asert.assertTrue(getLkContent().elementsMenuLk("Управление\n" + "доверенностями"), "В меню ЛК отсутствует элемент Управление доверенностями");
        getLkContent().clickElementMenu("Управление\n" + "доверенностями");
        asert.assertEquals(getLkContent().getTextActiveElementMenuLk(),"Управление\n" + "доверенностями");
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/attorneys","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Управление доверенностями","Открылась страница с несоответствующим заголовком");

        asert.assertTrue(getLkContent().elementsMenuLk("Онлайн-консультант"), "В меню ЛК отсутствует элемент Онлайн-консультант");
        /*getLkContent().clickElementMenu("Онлайн-консультант");
        asert.assertEquals(getLkContent().getTextActiveElementMenuLk(),"Онлайн-консультант");
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Онлайн-консультант","Открылась страница с несоответствующим заголовком");*/

        asert.assertTrue(getLkContent().buttonMinimaseLk("Свернуть"),"Отсутствует ссылка Свернуть ЛК");


        getLkContent().rollUpMenuLk();
        asert.assertTrue(getLkContent().smallLk(),"Ошибка свертки меню личного кабинета");
        asert.assertTrue(getLkContent().avatar(),"Отсутствует img аватара user");
        getLkContent().clickAvatar();
        asert.assertEquals(getLkContent().getUrlPage(),"http://192.168.111.62/lk/#/profile","Открылась страница с несоответствующим адрессом");
        asert.assertEquals(getLkContent().getTextTittlePage(),"Профиль","Открылась страница с несоответствующим заголовком");
        asert.assertTrue(getLkContent().elementsMenuLk("Подать заявку"), "В меню ЛК отсутствует элемент Подать заявку");

        getLkContent().rollUpMenuLk();
        asert.assertFalse(getLkContent().smallLk(),"Ошибка развертки меню личного кабинета");


        asert.assertAll();

    }
}
