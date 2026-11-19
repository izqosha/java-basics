package org.islam.calculator;

import org.islam.calculator.calculator.Calculator;
import org.islam.calculator.history.HistoryManager;

import java.util.List;
import java.util.Scanner;

public class Application {
    private static final String PROMPT = "> ";
    private static final String EXIT_COMMAND = "exit";
    private static final String RESULT_FORMAT = " = ";
    private static final String RESULT_TEXT = "Результат: ";
    private static final String HISTORY_CLEARED = "История очищена";
    private static final String HISTORY_IS_EMPTY = "История пуста";
    private static final String HELP_MESSAGE =
            "Доступные команды:\n" +
            "\n" +
            "<число> <оператор> <число> \n" +
            "\n" +
            "Операторы: \n" +
            "+ сложение \n" +
            "- вычитание \n" +
            "* умножение \n" +
            "/ деление \n" +
            "\n" +
            "Дополнительные команды: \n" +
            "history - показать историю \n" +
            "last    - показать последнюю операцию\n" +
            "clear   - очистить историю\n" +
            "exit    - выход";

    private static final String CMD_HELP = "help";
    private static final String CMD_HISTORY = "history";
    private static final String CMD_LAST = "last";
    private static final String CMD_CLEAR = "clear";

    private static final int PART_FIRST_NUMBER = 0;
    private static final int PART_OP = 1;
    private static final int PART_SECOND_NUMBER = 2;

    private final Calculator calculator = new Calculator();
    private final Scanner scanner = new Scanner(System.in);
    private final HistoryManager historyManager = new HistoryManager();

    public void run() {
        while(true) {
            System.out.print(PROMPT);
            String input = scanner.nextLine().trim();
            if(input.equals(EXIT_COMMAND)) break;
            processInput(input);
        }
    }

    public void processInput(String input) {
        if (input.equalsIgnoreCase(CMD_CLEAR)) {
            historyManager.clear();
            System.out.println(HISTORY_CLEARED);
            return;
        }
        if (input.equalsIgnoreCase(CMD_LAST)) {
            String lastRecord = historyManager.getLastRecord();
            if (lastRecord == null) {
                System.out.println(HISTORY_IS_EMPTY);
            } else {
                int equalIndex = lastRecord.indexOf("=");
                if (equalIndex != -1) {
                    String onlyResult = lastRecord.substring(equalIndex + 1).trim();
                    System.out.println(onlyResult);
                }
            }
            return;
        }
        if (input.equalsIgnoreCase(CMD_HELP)) {
            System.out.println(HELP_MESSAGE);
            return;
        }
        if (input.equalsIgnoreCase(CMD_HISTORY)) {
            List<String> history = historyManager.getHistory();
            if (history.isEmpty()) {
                System.out.println(HISTORY_IS_EMPTY);
            } else {
                for ( int i = 0; i < history.size(); i++) {
                    System.out.println((i + 1) + ") " + history.get(i));
                }
            }
            return;
        }

        try {
            String[] parts = input.split(" ");
            double result = calculator.calculate(
            Double.parseDouble(parts[PART_FIRST_NUMBER]),
            parts[PART_OP],
            Double.parseDouble(parts[PART_SECOND_NUMBER])
            );
            System.out.println(RESULT_TEXT + result);
            String record = input + RESULT_FORMAT + result;
            historyManager.addRecord(record);
        } catch (NumberFormatException e) {
            System.out.println(Calculator.ERROR_INVALID_FORMAT);
        }
    }
}
