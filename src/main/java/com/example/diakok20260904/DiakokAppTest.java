package com.example.diakok20260904;

import org.junit.Test;

public class DiakokAppTest {
    public static Boolean isRunningTest = false;

    @Test
    public void testMain() {
        isRunningTest = true;
        DiakokApplication.main(null);
        isRunningTest = false;
    }

    @Test
    public void testStart() {
        isRunningTest = true;
        DiakokApplication app = new DiakokApplication();
        try {
            app.start(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        isRunningTest = false;
    }
}
