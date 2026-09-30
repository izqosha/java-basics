import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = scanner.nextInt();
        if (rate >= 85) {
            System.out.println("Your grade is: A!");
        } else if (rate >= 70) {
            System.out.println("Ur grade is: B");
        } else if (rate >= 50) {
            System.out.println("Ur grade is: C");
        } else {
            System.out.println("Its fail bro");
        }
    }
}
