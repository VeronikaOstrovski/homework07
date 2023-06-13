package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    public void stringIsNotEmpty() {
        SimpleTest stringIsNotEmpty = new SimpleTest();
        String notNullString = "Test";
        assertNotNull(notNullString);
    }

    @Test
    public void theTwoValuesAreEqual() {
        SimpleTest theTwoValuesAreEqual = new SimpleTest();
        assertTrue(25==25);
    }


    @Test
    public void theTwoValuesAreNotEqual() {
        SimpleTest theTwoValuesAreNotEqual = new SimpleTest();
        assertTrue(25!=12);
    }


}


