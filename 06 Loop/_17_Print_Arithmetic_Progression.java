
import java.util.Scanner;

public class _17_Print_Arithmetic_Progression {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of AP ");
        int a = sc.nextInt();
        System.out.println("Enter the Difference between Ap: ");
        int d = sc.nextInt();
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int term = a + i * d;

            System.out.print(term + " ");
        }
    }

}
