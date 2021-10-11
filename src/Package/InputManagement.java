package Package;
import java.util.Scanner;

public class InputManagement {
    /* Input */
    public static String RouteInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("|--- Select Lesson below: ---|");
        System.out.println("=> Method = 'method' ");
        System.out.println("=> Classes = 'classes' ");
        System.out.println("\"clear\" console");
        System.out.println("\"exit\" console");
        String input = scan.nextLine();
        return input;
    }

    public static String StandardInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }
}
