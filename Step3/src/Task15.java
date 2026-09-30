public class Task15 {
    public static void main(String[] args) {
        String input = "abc";
        try {
            int number = Integer.parseInt(input);
            System.out.println("num:" + number);
        } catch (NumberFormatException e) {
            System.out.println("wrong buddy");
        }
    }
}
