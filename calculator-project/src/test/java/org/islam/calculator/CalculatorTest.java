package org.islam.calculator;
import org.islam.calculator.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void additionReturnsCorrectResult() {
        assertEquals(8.0, calculator.calculate(5, "+", 3), 0.001);
    }

    @Test
    void multiplyReturnsCorrectResult() {
        assertEquals(25.0, calculator.calculate(5, "*", 5), 0.001);
    }

    @Test
    void minusReturnsCorrectResult() {
        assertEquals(7.0, calculator.calculate(10, "-", 3), 0.001);
    }

    @Test
    void divisionReturnsCorrectResult() {
        assertEquals(5.0, calculator.calculate(5, "/", 1), 0.001);
    }

    @Test
    void divisionByZeroThrowsException() {
        assertThrows(ArithmeticException.class,
                () -> calculator.calculate(5, "/", 0));
    }
}

