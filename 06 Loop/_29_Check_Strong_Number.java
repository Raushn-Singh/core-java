
import java.util.Scanner;

public class _29_Check_Strong_Number {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum = sum + fact;
            num /= 10;
        }

        if (sum == n) {
            System.out.println("The Number is strong Number");
        } else {
            System.out.println("The Number is not Strong Number");
        }

    }

}
