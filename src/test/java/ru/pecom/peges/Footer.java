package ru.pecom.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer extends BasePage{
    @FindBy(css = ".footer-second-menu")
    private WebElement footer;
    @FindBy(css = ".footer-light-menu")
    private WebElement footerMenuLight;
    @FindBy(css = ".row")
    private WebElement rowFooterMenuLight;
    private String locatorMenuItem = ".menu-item";
    private String locatorFieldSearch = ".footer .form-control";
    private String locatorIconLupa = ".footer .fa-search";
    private String locatorPhone = ".tel";
    private String locatorIkonLinkVk = "[href=\"http://vk.com/pecom\"]";
    private String locatorIkonLinkFeceBook = "[href=\"https://www.facebook.com/pecom.ru\"]";
    private String locatorIkonLinkTeleg = "[href=\"/services-are/telegram/\"]";
    private String locatorTextButtonComment = ".btn-recall span";
    private String locatorLinkDownFooter = ".copy-link";
    private String locatorTextDownFooter = ".col-sm-7";
    private String locatorLinkSafePersonInfor = "[href=\"https://pecom.ru/info/o-zashchite-personalnykh-dannykh/\"]";
    private String locatorLinkGooglePlay = "[href=\"https://play.google.com/store/apps/details?id=ru.pecom." +
            "android&referrer=utm_source%3Dm.pecom.ru%26utm_medium%3Dfree%26utm_campaign%3Ddesktop_footer \"]";
    private String locatorLinkAppStore =
            "[href=\"https://itunes.apple.com/app/apple-store/id1270225018?pt=118848033&ct=desktop_footer&mt=8\"]";

    public String menuFooter = "БИЗНЕСУ\n" + "Тарифы\n" + "Документы\n" +  "Сотрудничество\n" +  "Поставщикам и перевозчикам\n" +
            "Интернет-магазинам\n" +  "Разработчикам\n" + "ЧАСТНЫМ ЛИЦАМ\n" +  "Порядок оформления и отправки груза\n" +
            "Порядок получения груза\n" +  "Документы на отправку\n" + "Документы на получение\n" +
            "Договоры и бланки документов\n" +  "НАПРАВЛЕНИЯ\n" + "Грузоперевозки по России\n" +
            "Грузоперевозки Россия — Казахстан\n" + "Грузоперевозки из Китая в Россию\n" +
            "Грузоперевозки по Казахстану\n" +  "УСЛУГИ\n" +  "Виды перевозки\n" +  "Автоперевозка\n" + "Авиаперевозка\n" +
            "Аэропорт — Аэропорт НОВОЕ\n" + "Типы перевозки\n" + "Перевозка сборного груза\n" + "Full-Truck сервис\n" +
            "Дополнительные услуги\n" + "Забор груза\n" + "Доставка груза\n" + "Льготная доставка груза\n" +
            "Погрузо-разгрузочные работы\n" + "Упаковка\n" + "Ответственное хранение и 3PL\n" +
            "Страхование груза\n" + "Возврат документов\n" + "Внутритарный учет\n" + "Перевозка сопроводительных документов\n" +
            "Доставка в гипермаркеты\n" + "Дубликаты бухгалтерских документов\n" + "Наложенный платеж\n" +
            "СЕРВИСЫ\n" + "Расчет стоимости\n" + "Заявка на перевозку\n" + "Статус груза/заявки\n" +
            "Предварительное оформление\n" + "Обратный звонок\n" + "Telegram\n" + "УСЛОВИЯ ПЕРЕВОЗОК\n" +
            "Графики и сроки перевозки\n" + "Требования к грузу\n" + "Требования к упаковке\n" + "Условия оплаты\n" +
            "КОНТАКТЫ\n" + "Список филиалов\n" + "Отзывы и предложения\n" + "Дополнительные контакты\n" +
            "О КОМПАНИИ\n" + "Карьера в «ПЭК»\n" + "ПЭК Rally";

    public Footer(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void moveToFooter(){
        moveTo(footerMenuLight);
    }

    public boolean elementMenuItem(String nameElementMenu){

        return comparisonElementList(locatorMenuItem, nameElementMenu);
    }

    public String  contentMenuFooter(){
        moveTo(footer);
        return footer.getText();
    }

    public String placeholderFieldSearch(){

        return getAttribute(locatorFieldSearch,"placeholder");
    }

    public boolean ikonLupa(){
        return visibilityElement(locatorIconLupa);
    }
    public boolean phone(){
        return visibilityElement(locatorPhone);
    }
    public boolean ikomVK(){
        return visibilityElement(locatorIkonLinkVk);
    }
    public boolean ikonFaceBook(){
        return visibilityElement(locatorIkonLinkFeceBook);
    }
    public boolean ikonTeleg(){
        return visibilityElement(locatorIkonLinkTeleg);
    }

    public String textButtonComment(){
        return getTextCss(locatorTextButtonComment);
    }

    public boolean linksDownFooter(String nameLink){
        moveTo(rowFooterMenuLight);
        return comparisonElementList(locatorLinkDownFooter, nameLink);
    }
    public String textDownFooter(){
        return getTextCss(locatorTextDownFooter);
    }
    public String textLinkSafePersonInform(){
        return getTextCss(locatorLinkSafePersonInfor);
    }

    public boolean visibleLinkGooglePlay(){
        return visibilityElement(locatorLinkGooglePlay);
    }

    public boolean visibleLinkAppStore(){
        return visibilityElement(locatorLinkAppStore);
    }
}
