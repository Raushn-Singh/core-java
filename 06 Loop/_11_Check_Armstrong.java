
import java.util.Scanner;

public class _11_Check_Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;

        }
        if (sum == num) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palidrome");
        }
    }
}
