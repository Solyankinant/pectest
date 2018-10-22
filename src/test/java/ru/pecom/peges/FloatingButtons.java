package ru.pecom.peges;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingButtons extends BasePage {
    private String text = "Начать чат, мы онлайн!";
    private String locatorImgButtonChat = ".wb_2 img";
    private String locatorImgButtonConsultant = ".pm img";
    private String locatorTextNameChat = ".lt-welcome .lt-chat-header__txt";
    private String locatorTextWelcomChat = ".lt-welcome .lt-baloon__txt";
    private String buttonChat = ".wb_2";
    private String buttonConsultant = ".pm";
    @FindBy(css = ".lt-welcome>.lt-wrapper-close")
    protected WebElement buttonCloseChat;
    @FindBy(css = ".lt-welcome")
    protected WebElement window;



    public FloatingButtons(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private boolean presentButtonOnPage(String locator) {
        try {
            waitElementClickable(locator, 5);
            return true;
        } catch (TimeoutException e) {
            return false;

        }
    }

    public boolean presentButtonChat() {
        return presentButtonOnPage(buttonChat);
    }

    public boolean presentButtonConsultant() {
        return presentButtonOnPage(buttonConsultant);
    }

    public String imgButtonChat() {
        return getAttribute(locatorImgButtonChat, "src");
    }

    public String imgButtonConsultant() {
        return getAttribute(locatorImgButtonConsultant, "src");
    }

    public void clickButtonOnlainChat() {
        buttonClickCss(buttonChat);
    }

    public void clickButtonConsultant() {
        buttonClickCss(buttonConsultant);
    }

    public void closeChat() {
        moveTo(buttonCloseChat);
        buttonCloseChat.click();
    }

    public void selectWindow() {
        waitClick(window, driver, 5);
        moveTo(window);
    }

    public String nameChat() {
        return getTextCss(locatorTextNameChat);
    }

    public String textWelcomChat() {
        return getTextCss(locatorTextWelcomChat);
    }

}
