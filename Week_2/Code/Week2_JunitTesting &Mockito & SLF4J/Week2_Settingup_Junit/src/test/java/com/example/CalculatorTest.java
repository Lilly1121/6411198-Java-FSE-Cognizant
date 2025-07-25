package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.example.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testAdditionNegative() {
        // Arrange
        int a = -3;
        int b = 2;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(-1, result);
    }
}
