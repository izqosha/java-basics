package org.islam.calculator.calculator;

import org.islam.calculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public static final String ERROR_DIVISION_ZERO = "Нельзя делить на 0";
    public static final String ERROR_INVALID_FORMAT = "Неккоректный ввод";
    public static final String ERROR_ILLEGAL_ARGUMENT = "Неизвестный оператор";
    public static final String ERROR_INVALID_INPUT = "Неккоректный ввод. Ожидается: <число> <оператор> <число>";

    private static final String OP_PLUS = "+";
    private static final String OP_MINUS = "-";
    private static final String OP_MULTIPLY = "*";
    private static final String OP_DIVIDE = "/";
    private static final String OP_MODULO = "%";

    private final Map<String, Operation> operations = new HashMap<>();

    public Calculator() {
        operations.put(OP_PLUS, new AddOperation());
        operations.put(OP_MINUS, new MinusOperation());
        operations.put(OP_MULTIPLY, new MultiplyOperation());
        operations.put(OP_DIVIDE, new DivideOperation());
        operations.put(OP_MODULO, new ModuloOperation());
    }
    public double  calculate(double firstNumber, String operator, double secondNumber) {
        Operation op = operations.get(operator);
        if (op == null) {
            throw new IllegalArgumentException(ERROR_INVALID_FORMAT);
        }
        return op.execute(firstNumber, secondNumber);
    }
}
