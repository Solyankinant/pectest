package ru.pecom.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer extends BasePage{
    @FindBy(css = ".footer-second-menu")
    protected WebElement footer;
    @FindBy(css = ".footer-light-menu")
    protected WebElement footerMenuLight;

    public String menuFooter = "БИЗНЕСУ\n" +
            "Тарифы\n" +
            "Документы\n" +
            "Сотрудничество\n" +
            "Поставщикам и перевозчикам\n" +
            "Интернет-магазинам\n" +
            "Разработчикам\n" +
            "ЧАСТНЫМ ЛИЦАМ\n" +
            "Порядок оформления и отправки груза\n" +
            "Порядок получения груза\n" +
            "Документы на отправку\n" +
            "Документы на получение\n" +
            "Договоры и бланки документов\n" +
            "НАПРАВЛЕНИЯ\n" +
            "Грузоперевозки по России\n" +
            "Грузоперевозки Россия — Казахстан\n" +
            "Грузоперевозки из Китая в Россию\n" +
            "Грузоперевозки по Казахстану\n" +
            "УСЛУГИ\n" +
            "Виды перевозки\n" +
            "Автоперевозка\n" +
            "Авиаперевозка\n" +
            "Аэропорт — Аэропорт НОВОЕ\n" +
            "Типы перевозки\n" +
            "Перевозка сборного груза\n" +
            "Full-Truck сервис\n" +
            "Дополнительные услуги\n" +
            "Забор груза\n" +
            "Доставка груза\n" +
            "Льготная доставка груза\n" +
            "Погрузо-разгрузочные работы\n" +
            "Упаковка\n" +
            "Ответственное хранение и 3PL\n" +
            "Страхование груза\n" +
            "Возврат документов\n" +
            "Внутритарный учет\n" +
            "Перевозка сопроводительных документов\n" +
            "Доставка в гипермаркеты\n" +
            "Дубликаты бухгалтерских документов\n" +
            "Наложенный платеж\n" +
            "СЕРВИСЫ\n" +
            "Расчет стоимости\n" +
            "Заявка на перевозку\n" +
            "Статус груза/заявки\n" +
            "Предварительное оформление\n" +
            "Обратный звонок\n" +
            "Telegram\n" +
            "УСЛОВИЯ ПЕРЕВОЗОК\n" +
            "Графики и сроки перевозки\n" +
            "Требования к грузу\n" +
            "Требования к упаковке\n" +
            "Условия оплаты\n" +
            "КОНТАКТЫ\n" +
            "Список филиалов\n" +
            "Отзывы и предложения\n" +
            "Дополнительные контакты\n" +
            "О КОМПАНИИ\n" +
            "Карьера в «ПЭК»\n" +
            "ПЭК Rally";

    public Footer(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void moveToFooter(){
        moveTo(footer);

    }

    public String  contentMenuFooter(){
        return footer.getText();
    }
}
