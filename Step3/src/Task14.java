import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int len = sentence.length();
        System.out.println(len);
        String news = sentence.trim();
        int len2 = news.length();
        System.out.println(len2);
    }
}
