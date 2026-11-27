package org.islam.calculator.operations;

import org.islam.calculator.calculator.Calculator;

public class ModuloOperation implements Operation {
    private static final double ZERO = 0;
    @Override
    public double execute(double firstNumber, double secondNumber) {
        if (secondNumber == ZERO) {
            throw new ArithmeticException(Calculator.ERROR_DIVISION_ZERO);
        }
        return firstNumber % secondNumber;
    }
}
