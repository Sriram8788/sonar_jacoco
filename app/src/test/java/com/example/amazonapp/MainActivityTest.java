package com.example.amazonapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainActivityTest {

    @Test
    public void testGreet() {
        MainActivity activity = new MainActivity();
        String result = activity.greet("Amazon");
        assertEquals("Hello, Amazon!", result);
    }
}
