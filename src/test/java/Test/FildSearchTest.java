package Test;


import org.testng.annotations.Test;


public class FildSearchTest extends BaseTest {


    @Test
    public void fildSearchTest() {
        //openSitePec();
        getFieldSearchCargoInMenu().inputCodeCargoInFieldSearch();
        getFieldSearchCargoInMenu().resultSearchCargo();
        //closseBrauser();

    }
}
