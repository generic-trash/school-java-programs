import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        String result = "";
        int latestspace = 0, lastspace = 0;
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ') {
                latestspace = i;
                result += reverse(sentence.substring(lastspace, latestspace).trim()) + " ";
                lastspace = i;
            }
        }
        result += reverse(sentence.substring(lastspace).trim());
        System.out.println(result);
    }

    public static String reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) res += str.charAt(i);
        return res;
    }
}
