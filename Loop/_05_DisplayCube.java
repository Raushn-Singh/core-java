
import java.util.Scanner;

public class _05_DisplayCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Number of terms :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.err.println("Number is  :" + i + "and Cube of the " + i + "is :" + (i * i * i));
        }

    }
}
