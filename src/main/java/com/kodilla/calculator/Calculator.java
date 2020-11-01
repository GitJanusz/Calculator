package com.kodilla.calculator;

public class Calculator {

    public int addition(int numberA, int numberB){
        return numberA + numberB;
    }

    public int subtraction(int numberA, int numberB){
        return numberA - numberB;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultAdd = calculator.addition(1,4);
        int resultSub = calculator.subtraction(3,2);
        System.out.print("Result of the addition: " + resultAdd + "\nResult of the subtraction: " + resultSub);
    }
}

