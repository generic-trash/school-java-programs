import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        String result = "";
        int latestspace = 0, lastspace = 0;
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ') {
                latestspace = i;
                result = sentence.substring(lastspace, latestspace).trim() + " " + result;
                lastspace = i;
            }
        }
        result = sentence.substring(lastspace).trim() + " " + result;
        System.out.println(result);
    }

}
