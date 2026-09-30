import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        if (d % 2 == 0) {
            System.out.println("Chetnoe");
        } else {
            System.out.println("ne chetnoe");
        }
    }
}
