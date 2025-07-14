
import java.util.Scanner;

public class _09_Find_Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Number:");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial = factorial * i;
        }
        System.err.println("Factorial is" + factorial);
    }
}
