package ru.pecom.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FooterVisibleElementsTest extends BaseTest{
    @Test
    public void testVisibleElementsFooterSite(){

        SoftAssert asert = new SoftAssert();
        getFooter().moveToFooter();
        asert.assertTrue(getFooter().elementMenuItem("О компании"),"Отсутствует ссылка menu-item");
        asert.assertTrue(getFooter().elementMenuItem("Пресс-центр"),"Отсутствует ссылка menu-item");
        asert.assertTrue(getFooter().elementMenuItem("Новости"),"Отсутствует ссылка menu-item");
        asert.assertTrue(getFooter().elementMenuItem("Полезная информация"),"Отсутствует ссылка menu-item");
        asert.assertTrue(getFooter().elementMenuItem("Карьера в «ПЭК»"),"Отсутствует ссылка menu-item");
        asert.assertEquals(getFooter().placeholderFieldSearch(),"поиск по сайту");
        asert.assertTrue(getFooter().ikonLupa(),"В поле поиска нет иконки Лапа");
        asert.assertTrue(getFooter().phone(),"Отсутствует номер телефона");
        asert.assertTrue(getFooter().ikomVK(),"Отсутствует номер ikomVK");
        asert.assertTrue(getFooter().ikonFaceBook(),"Отсутствует номер ikonFaceBook");
        asert.assertTrue(getFooter().ikonTeleg(),"Отсутствует номер ikonTeleg");
        asert.assertEquals(getFooter().textButtonComment(),"Отзыв о сайте");
        asert.assertEquals(getFooter().contentMenuFooter(),getFooter().menuFooter);
        asert.assertTrue(getFooter().linksDownFooter("Карта сайта"),"Отсутствует ссылка Карта сайта");
        asert.assertTrue(getFooter().linksDownFooter("Направления"),"Отсутствует ссылка Направления");
        asert.assertTrue(getFooter().linksDownFooter("Типы перевозок"),"Отсутствует ссылка Типы перевозок");
        /*asert.assertEquals(getFooter().textDownFooter()," © 2018 Компания «ПЭК» | Все права защищены и охраняются законом | ");*/ //надо запихать текст в тег
        asert.assertEquals(getFooter().textLinkSafePersonInform(),"О защите персональных данных");
        asert.assertTrue(getFooter().visibleLinkGooglePlay(),"Не отображается иконка-ссылка  Google Play");
        asert.assertTrue(getFooter().visibleLinkAppStore(),"Не отображается иконка-ссылка App Store");




        asert.assertAll();
    }
}
