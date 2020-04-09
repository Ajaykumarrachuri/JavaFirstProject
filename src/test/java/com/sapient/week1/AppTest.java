package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private CheckEven app;
    
    @Before
    public void setup() {
        app = new CheckEven();
    }
    
    
    @Test
    public void testWordCountString() {
        Boolean count = app.check(2);
        assertTrue(count == true);
    }

    @Test
    public void testWordCountEmpty() {
        Boolean count = app.check(3);
        assertTrue(count == false);
    }

    @Test
    public void testWordCountNull() {
        Boolean count = app.check(4);
        assertTrue(count == true);
    }

    @Test
    public void testWordCountMore() {
        Boolean count = app.check(5);
        assertTrue(count == false);
    }

}