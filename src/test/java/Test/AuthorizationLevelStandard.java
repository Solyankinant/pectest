package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLevelStandard extends BaseTest{

    @Test
    public void PecomTestLK(){
        //openSitePec();
        getAuthorization().authorizationPecLk("pecomtest1", "pecomtest1");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorButtonLK), "Выйти");
        Assert.assertEquals(getAuthorization().getTextCss(getAuthorization().locatorLevelUser), "СТАНДАРТНЫЙ");
        getAuthorization().exitLk();
        //closseBrauser();

    }
}
