import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        String srt = "5 + 3";

        try {
            String parts[] = srt.split(" \\+ ");
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            System.out.println("false buddy");
        }
    }
}
