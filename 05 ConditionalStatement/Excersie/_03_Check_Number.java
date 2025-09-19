
import java.util.Scanner;

public class _03_Check_Number {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Postitive Number");

        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number is zero ");
        }
    }
}
