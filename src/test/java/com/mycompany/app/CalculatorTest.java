package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void testAddition() {
        assertEquals(6, calculator.additionFromIntegers(5, 1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(4, calculator.subtractFromIntegers(5, 1));
    }

    @Test
    public void testDivision() {
        assertEquals(5, calculator.divisionFromIntegers(5, 1));
    }

    @Test
    public void testMultiplication() {
        assertEquals(5, calculator.multiplicationFromIntegers(5, 1));
    }

}