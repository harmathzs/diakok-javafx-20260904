package com.example.diakok20260904;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiakokTest {
    public static boolean isRunningTest = false;

    @Before
    public void testBefore() {
        isRunningTest = true;
    }
    @After
    public void testAfter() {
        isRunningTest = false;
    }

    @Test
    public void testMain() {
        DiakokApplication.main(null);
    }
    @Test
    public void testStart() {
        DiakokApplication app = new DiakokApplication();
        try {
            app.start(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
