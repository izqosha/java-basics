package org.islam.calculator.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public static final String ERROR_DIVISION_ZERO = "Нельзя делить на 0";
    public static final String ERROR_INVALID_FORMAT = "Неккоректный ввод";

    private static final String OP_PLUS = "+";
    private static final String OP_MINUS = "-";
    private static final String OP_MULTIPLY = "*";
    private static final String OP_DIVIDE = "/";
    private static final double ZERO = 0;

    static Map<String, Operation> operations = new HashMap<>();

    public static double  calculate(double firstNumber, String operator, double secondNumber) {
        operations.put("+", new AddOperation());
        operations.put("-", new MinusOperation());
        operations.put("*", new MultiplyOperation());
        operations.put("/", new DivideOperation());
        operations.put("%", new ModuloOperation());
        Operation op = operations.get(operator);
        if (op == null) {
            throw new IllegalArgumentException(ERROR_INVALID_FORMAT);
        }
        return op.execute(firstNumber, secondNumber);
    }

    public static double divide(double firstNumber, double secondNumber) {
        if(secondNumber == ZERO) {
            throw new ArithmeticException(ERROR_DIVISION_ZERO);
        }
        return firstNumber / secondNumber;
    }
}
