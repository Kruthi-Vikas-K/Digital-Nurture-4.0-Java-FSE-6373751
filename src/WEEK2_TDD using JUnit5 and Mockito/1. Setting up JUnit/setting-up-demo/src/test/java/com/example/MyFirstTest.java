package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
}