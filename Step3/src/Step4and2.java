import java.util.Scanner;

public class Step4and2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.print("first num: ");
                int first = scanner.nextInt();
                System.out.print("operation:");
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
                    System.out.println(first / second);
                }
                System.out.print("type exit for exit:" );
                String exit = scanner.next();
                if (exit.equals("exit")){
                    break;
                }
            }
        }
    }

