package org.islam.calculator;
import org.islam.calculator.calculator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OperationTest {
    @Test
    void addOperationWorks() {
        Operation op = new AddOperation();
        assertEquals(8.0, op.execute(5, 3), 0.001);
    }

    @Test
    void unknownOperatorThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> Calculator.calculate(5, "&", 3));
    }

    @Test
    void multiplyOperationTest() {
        Operation operation = new MultiplyOperation();
        assertEquals(12, operation.execute(3, 4), 0.0001);
    }

    @Test
    void divideOperationTest() {
        Operation operation = new DivideOperation();
        assertEquals(2.5, operation.execute(5, 2), 0.0001);
    }
}