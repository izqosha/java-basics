package org.islam.calculator.operations;

public class ModuloOperation implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }
}
