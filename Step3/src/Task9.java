import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        while (!word.equals("stop")){
            System.out.print("Write smth(write stop to stop): ");
            word = scanner.nextLine();
        }
    }
}
