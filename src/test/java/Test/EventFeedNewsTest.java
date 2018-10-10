package Test;

import org.testng.annotations.Test;

public class EventFeedNewsTest extends BaseTest{
    @Test
    public void eventFeedNewsTest(){
        getEventsFeed().openFeedEvents();

    }
}
