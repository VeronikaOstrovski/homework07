package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
   // Number1
    @Test
    public void calculator1(){
        Calculator calculatorToPlus = new Calculator();
        calculatorToPlus.calculatorPlus(10, 15);
//        calculatorToPlus.setFirstNumber(10);
//        calculatorToPlus.setSecondNumber(15);
        assertEquals(25, calculatorToPlus.getResult());
    }

    // Number2
    @Test
    public void calculator2(){
        Calculator calculatorToMinus = new Calculator();
        calculatorToMinus.calculatorMinus(32, 20);
        assertEquals(12, calculatorToMinus.getResult());
    }

    // Number3
    @Test
    public void calculator3(){
        Calculator calculatorToPlus = new Calculator();
        calculatorToPlus.calculatorPlus(2,3);
        assertEquals(5, calculatorToPlus.getResult());
    }

    // Number4
    @Test
    public void calculator4(){
        Calculator calculatorToMinus = new Calculator();
        calculatorToMinus.calculatorMinus(24,12);
        assertEquals(12, calculatorToMinus.getResult());
    }

    // Homework 08
    // Task 1
    // Number5
    @Test
    public void calculator5(){
        Calculator calculatorToMultiplication = new Calculator();
        calculatorToMultiplication.calculatorMultiplication(3.0,4.0);
        assertEquals(12, calculatorToMultiplication.getResultDouble());
    }

    // Number6
    @Test
    public void calculator6(){
        Calculator calculatorToDivision = new Calculator();
        calculatorToDivision.calculatorDivision(50.0, 2.0);
//        calculatorToDivision.setThirdNumber(50.0);
//        calculatorToDivision.setFourthNumber(2.0);
        assertEquals(25, calculatorToDivision.getResultDouble());
    }
}
