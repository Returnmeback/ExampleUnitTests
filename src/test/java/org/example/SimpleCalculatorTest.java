package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));
    }
    @Test
    void threePlusSevenShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3,7));
    }
    @Test
    void twoMinusOneShouldEqualOne () {
        var calculator = new SimpleCalculator();
        assertEquals(1, calculator.subtract(2,1) );
    }
}