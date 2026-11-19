package org.islam.calculator.calculator;

public class DivideOperation implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
