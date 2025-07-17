
import java.util.Scanner;

public class _21_Reverse_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;

            rev = rev * 10 + rem;

            n /= 10;

        }

        System.out.println("Reverse " + rev);
    }
}
