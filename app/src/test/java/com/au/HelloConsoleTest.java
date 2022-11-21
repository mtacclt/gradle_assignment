package com.au;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloConsoleTest {
        @Test void consoleCapitalises() throws Exception {

        HelloConsole classUnderTest = new HelloConsole();
        String[] var0 = new String[1];
        var0[0] = "test case";
        assertEquals("Hello Ivy!",classUnderTest.HelloConsoleOutput(var0));
    }
}
