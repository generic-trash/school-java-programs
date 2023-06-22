import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            char lch = Character.toLowerCase(ch);
            if (lch != 'a' && lch != 'e' && lch != 'i' && lch != 'o' && lch != 'u') {
                result += (ch);
            }
        }
        System.out.println("Sentence after removing vowels: " + result);
    }


}