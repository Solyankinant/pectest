package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest{
    @Test
    public void footerTest(){
        //openSitePec();
        getAuthorization().authorizationPecLk("pecomtest1","pecomtest1");
        getFooter().moveToFooter();
        //System.out.println(driver.findElement(By.cssSelector(".footer-second-menu")).getText());
        Assert.assertEquals(getFooter().contentMenuFooter(),getFooter().menuFooter);

        //closseBrauser();

    }
}
