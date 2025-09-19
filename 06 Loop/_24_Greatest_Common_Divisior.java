
import java.util.Scanner;

public class _24_Greatest_Common_Divisior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second Num ber :");
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        System.out.println("GCD IS" + gcd);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
