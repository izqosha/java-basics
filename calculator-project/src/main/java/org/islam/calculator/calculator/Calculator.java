package org.islam.calculator.calculator;

public class Calculator {
    public static final String ERROR_DIVISION_ZERO = "Нельзя делить на 0";
    public static final String ERROR_INVALID_FORMAT = "Неккоректный ввод";

    private static final String OP_PLUS = "+";
    private static final String OP_MINUS = "-";
    private static final String OP_MULTIPLY = "*";
    private static final String OP_DIVIDE = "/";
    private static final double ZERO = 0;

    public static double  calculate(double firstNumber, String operator, double secondNumber) {
        switch (operator) {
            case (OP_PLUS):
                return firstNumber + secondNumber;
            case (OP_MINUS):
                return firstNumber - secondNumber;
            case (OP_MULTIPLY):
                return firstNumber * secondNumber;
            case (OP_DIVIDE):
                return divide(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException(ERROR_INVALID_FORMAT);
        }
    }

    public static double divide(double firstNumber, double secondNumber) {
        if(secondNumber == ZERO) {
            throw new ArithmeticException(ERROR_DIVISION_ZERO);
        }
        return firstNumber / secondNumber;
    }
}
