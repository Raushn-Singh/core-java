
import java.util.Scanner;

public class _20_Check_Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade");
        char ch = sc.next().charAt(0);
        if (ch == 'E' || ch == 'e') {
            System.out.println("Excellent");

        } else if (ch == 'V' || ch == 'v') {
            System.out.print("Very Good");
        } else if (ch == 'G' || ch == 'g') {
            System.out.println("Good");
        } else if (ch == 'A' || ch == 'a') {
            System.out.println("Average");
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("Fail");
        }
    }
}
