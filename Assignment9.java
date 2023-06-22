import java.util.Scanner;

public class Assignment9 {
    static String lcLUT = "abcdefghijklmnopqrstuvwxyz";
    static String ucLUT = lcLUT.toUpperCase();
    static String digitLUT = "1234567890";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word");
        String word = sc.nextLine().trim();

        System.out.println("Enter number");
        int n = sc.nextInt();

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                int index = lcLUT.indexOf(ch);
                index = (index + n) % lcLUT.length();
                result += lcLUT.charAt(index);
            }
            else if (Character.isUpperCase(ch)) {
                int index = ucLUT.indexOf(ch);
                index = (index + n) % ucLUT.length();
                result += ucLUT.charAt(index);
            }
            else if (Character.isDigit(ch)) {
                int index = digitLUT.indexOf(ch);
                index = (index + n) % digitLUT.length();
                result += digitLUT.charAt(index);
            }
        }
        System.out.println(result);
    }
}
