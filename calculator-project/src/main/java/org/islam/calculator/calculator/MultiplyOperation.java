package org.islam.calculator.calculator;

public class MultiplyOperation implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
