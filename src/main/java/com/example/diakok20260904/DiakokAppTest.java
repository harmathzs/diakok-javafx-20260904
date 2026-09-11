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
}
