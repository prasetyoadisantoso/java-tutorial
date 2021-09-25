package Package;
import java.util.Scanner;

public class InputManagement {
    /* Input */
    public static String Input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Route Yang Ingin Anda Pilih Dibawah dan Tulis: ");
        String input = scan.nextLine();
        return input;
    }
}
