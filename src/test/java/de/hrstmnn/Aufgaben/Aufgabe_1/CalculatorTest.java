package de.hrstmnn.Aufgaben.Aufgabe_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertAll(() -> assertEquals(4, Calculator.add(2, 2)),
                () -> assertEquals(0, Calculator.add(2, -2)),
                () -> assertEquals(-4, Calculator.add(-2, -2)),
                () -> assertEquals(1, Calculator.add(1, 0)));
    }

    @Test
    @DisplayName("Subtract two numbers")
    void subtract() {
        assertAll(() -> assertEquals(0, Calculator.subtract(2, 2)),
                () -> assertEquals(4, Calculator.subtract(2, -2)),
                () -> assertEquals(0, Calculator.subtract(-2, -2)),
                () -> assertEquals(1, Calculator.subtract(1, 0)));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        assertAll(() -> assertEquals(1, Calculator.divide(2, 2)),
                () -> assertEquals(-1, Calculator.divide(2, -2)),
                () -> assertEquals(1, Calculator.divide(-2, -2)),
                () -> assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(1, 0)));
    }
}