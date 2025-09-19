
import java.util.Scanner;

public class _16_Sum_Of_Odd_Digits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 != 0) {
                sum += r;
            }
            n /= 10;
        }

        System.out.println("The Sum of Odd Digits in a number :" + sum);
    }
}
