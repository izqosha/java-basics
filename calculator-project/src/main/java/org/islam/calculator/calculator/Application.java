package org.islam.calculator.calculator;

import java.util.Scanner;

public class Application {
    private static final String PROMPT = "> ";
    private static final String EXIT_COMMAND = "exit";
    private static final String RESULT_FORMAT = " = ";
    private static final int PART_FIRST_NUMBER = 0;
    private static final int PART_OP = 1;
    private static final int PART_SECOND_NUMBER = 2;

    private final Calculator calculator = new Calculator();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        while(true) {
            System.out.print(PROMPT);
            String input = scanner.nextLine().trim();
            if(input.equals(EXIT_COMMAND)) break;
            processInput(input);
        }
    }

    public void processInput(String input) {
        try {
            String[] parts = input.split(" ");
            double result = calculator.calculate(
            Double.parseDouble(parts[PART_FIRST_NUMBER]),
            parts[PART_OP],
            Double.parseDouble(parts[PART_SECOND_NUMBER])

            );
            System.out.println(input + RESULT_FORMAT + result);
        } catch (NumberFormatException e) {
            System.out.println(Calculator.ERROR_INVALID_FORMAT);
        }
    }
}
