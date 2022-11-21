package com.au;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloConsoleTest {
    @Test
    void consoleCapitalises() throws Exception {

        HelloConsole classUnderTest = new HelloConsole();
        String[] var0 = new String[1];
        var0[0] = "-m=the quick brown fox jumps over the lazy dog";
        assertEquals("The Quick Brown Fox Jumps Over The Lazy Dog", classUnderTest.HelloConsoleOutput(var0));
    }
}
