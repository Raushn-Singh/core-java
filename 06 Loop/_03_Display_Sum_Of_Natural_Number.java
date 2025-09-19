
import java.util.Scanner;

public class _03_Display_Sum_Of_Natural_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Natural Number :");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.err.println("Sum of natural number is :" + sum);

    }
}
