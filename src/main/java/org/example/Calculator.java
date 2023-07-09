package org.example;

public class Calculator {

    int firstNumber;
    int secondNumber;
    double thirdNumber;
    double fourthNumber;
    int result;
    double resultDouble;


    public int calculatorPlus (int firstNumber, int secondNumber) {
        return result = firstNumber+secondNumber;

    }

    public int calculatorMinus (int firstNumber, int secondNumber){
        return result = firstNumber-secondNumber;

    }

    // Homework 08
    // Task 1
    public double calculatorMultiplication (double thirdNumber, double fourthNumber) {
        return resultDouble = thirdNumber*fourthNumber;

    }

    public double calculatorDivision (double thirdNumber, double fourthNumber) {
        return resultDouble = thirdNumber/fourthNumber;

    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setThirdNumber(double thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public void setFourthNumber(double fourthNumber) {
        this.fourthNumber = fourthNumber;
    }

    public int getResult() {
        return result;
    }

    public double getResultDouble() {
        return resultDouble;
    }
}

