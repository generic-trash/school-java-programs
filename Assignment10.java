import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        System.out.print("Enter search word: ");
        String word = sc.nextLine().trim();

        if (sentence.contains(word)) {
            System.out.println("Exists");
            System.out.println(sentence.indexOf(word));
        } else {
            System.out.println("Doesn't exist");
        }
    }
}
