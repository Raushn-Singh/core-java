
import java.util.Scanner;

public class _22_Check_Palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        int n = num;
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if (rev == num) {
            System.out.println("Number is palindrome ");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
