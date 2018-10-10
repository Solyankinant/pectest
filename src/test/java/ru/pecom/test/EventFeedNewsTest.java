package ru.pecom.test;

import org.testng.annotations.Test;

public class EventFeedNewsTest extends BaseTest{
    @Test
    public void eventFeedNews(){
        getEventsFeed().openFeedEvents();

    }
}
