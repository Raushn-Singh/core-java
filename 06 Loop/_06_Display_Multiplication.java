
import java.util.Scanner;

public class _06_Display_Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Number :");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.err.println(n + "*" + i + "=" + (i * n));
        }

    }
}
