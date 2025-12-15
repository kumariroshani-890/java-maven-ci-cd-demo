package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testAppRunsWithoutError() {
        App.main(new String[]{});
        assertTrue(true); // if no exception, test passes
    }
}
