package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {

    @Test
    public void testAppLaunch() {
        App app = new App();
        assertNotNull(app);
    }
}
