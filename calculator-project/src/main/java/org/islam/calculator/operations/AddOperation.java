package org.islam.calculator.operations;

public class AddOperation implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}
