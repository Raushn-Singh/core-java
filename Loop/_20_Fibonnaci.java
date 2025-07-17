
import java.util.Scanner;

public class _20_Fibonnaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        int digitLen = 0;
        int n = num;
        while (n != 0) {
            digitLen++;
            int rem = n % 10;
            if (rem % 2 == 0) {
                evenSum += rem;
            } else {
                oddSum += rem;
            }
            n /= 10;
        }

        int a = oddSum;
        int b = evenSum;

        for (int i = 0; i < digitLen; i++) {
            System.out.println(a + "");
            int next = a + b;
            a = b;
            b = next;
        }

    }
}
