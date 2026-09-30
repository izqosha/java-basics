import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int s = 1;
        while (s != 0) {
            System.out.print("Write the num:(0 for stop): ");
             s = scanner.nextInt();
             i = i + s;
        }
        System.out.println(i);
    }
}
