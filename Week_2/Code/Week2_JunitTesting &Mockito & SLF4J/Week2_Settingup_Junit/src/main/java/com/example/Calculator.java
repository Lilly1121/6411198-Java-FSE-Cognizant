package com.example;

public class Calculator {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts second integer from first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides first integer by second
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}
