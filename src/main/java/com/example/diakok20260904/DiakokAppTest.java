package com.example.diakok20260904;

import org.junit.*;

public class DiakokAppTest {
    public static Boolean isRunningTest = false;

    @BeforeClass
    public static void testBeforeOnce() {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void testAfterOnce() {
        System.out.println("AfterClass");
    }

    @Before
    public void testBefore() {
        System.out.println("Before");
        isRunningTest = true;
    }
    @After
    public void testAfter() {
        System.out.println("After");
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
