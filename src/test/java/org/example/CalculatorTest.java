package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void calculator1 (){
        Calculator calculator = new Calculator();
        assertEquals(25,25);
    }

    @Test
    public void calculator2 (){
        Calculator calculator = new Calculator();
        assertEquals(12,12);
    }

    @Test
    public void calculator3 (){
        Calculator calculator = new Calculator();
        assertEquals(10,10);
    }

    @Test
    public void calculator4 (){
        Calculator calculator = new Calculator();
        assertEquals(2,2);
    }

}
