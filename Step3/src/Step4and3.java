import java.util.Scanner;
import java.util.InputMismatchException;

public class Step4and3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("first num: ");
                int first = scanner.nextInt();

                System.out.print("operation: ");
                String op = scanner.next();

                System.out.print("second num: ");
                int second = scanner.nextInt();

                if (op.equals("+")) {
                    System.out.println(first + second);
                } else if (op.equals("-")) {
                    System.out.println(first - second);
                } else if (op.equals("*")) {
                    System.out.println(first * second);
                } else if (op.equals("/")) {
                    if (second == 0) {
                        System.out.println("nelzya na 0 delit");
                    } else {
                        System.out.println(first / second);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("nekorektni vod");
                scanner.nextLine();
            }

            System.out.print("type exit for exit: ");
            String exit = scanner.next();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}