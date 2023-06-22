import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        int first = name.indexOf(" "), last = name.lastIndexOf(" ");
        String firstName = name.substring(0, first), lastName = name.substring(last);
        System.out.println("First Name: " + firstName);
        if (first != last) System.out.println("Middle Name: " + name.substring(first, last));
        System.out.println("Last Name: " + lastName);
    }
}
