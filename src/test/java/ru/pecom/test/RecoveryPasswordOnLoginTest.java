package ru.pecom.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RecoveryPasswordOnLoginTest extends BaseTest {
    @Test
    public void testRecoveryPasswordOnLogin(){
        SoftAssert asert = new SoftAssert();
        getAuthorization().openWindowRecoveryPassword();
        /*getRecoveryPassword().inputLoginUser("ttttttttttt");
        getRecoveryPassword().buttonNext.click();
        asert.assertEquals(getRecoveryPassword().textError(),"Логин не найден!");
        getRecoveryPassword().fieldInput.clear();*/
        getRecoveryPassword().inputLoginUser("pecomtest1");
        getRecoveryPassword().buttonNext.click();



        asert.assertAll();
    }
}
