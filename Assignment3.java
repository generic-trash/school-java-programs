import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path: ");
        String path = sc.nextLine();
        int first = path.indexOf("\\"), last = path.lastIndexOf("\\");
        String driveName = path.substring(0, first), fileName = path.substring(last + 1);
        System.out.println("Drive Name: " + driveName);
        if (first != last) System.out.println("Directory Name: " + path.substring(first + 1, last));
        System.out.println("File Name: " + fileName);
        if (fileName.contains(".")) System.out.println("Extension: " + fileName.substring(fileName.indexOf(".") + 1));
    }
}
