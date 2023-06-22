import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int specialCharCount = 0;
        int digitCount = 0;
        int wordCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                wordCount++;
            } else {
                specialCharCount++;
            }
        }

        // Increment wordCount for the last word
        wordCount++;

        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Special characters: " + specialCharCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Number of words: " + wordCount);

        sc.close();
    }
}