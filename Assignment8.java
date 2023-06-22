import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        int latestspace = 0, lastspace = 0;
        boolean flag = false;
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ') {
              latestspace = i;
              if (flag) System.out.println(sentence.substring(lastspace, latestspace).trim());
              flag = false;
              lastspace = i;
            }
            if (sentence.charAt(i) == sentence.charAt(i + 1) && Character.isLetter(sentence.charAt(i))) {
                System.out.println(sentence.substring(i, i + 2));
                flag = true;
            }
        }
        if (flag) System.out.println(sentence.substring(lastspace).trim());
    }
}
