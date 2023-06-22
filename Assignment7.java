import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println((int) ch);
            sum += (int) ch;
        }

        System.out.println("Sum of ASCII values: " + sum);

    }
}