
import java.util.Scanner;

public class _11_Check_Root_Of_Quadratic_Equation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = b * 2 - 4 * a * c;
        if (d > 0) {
            System.out.println("Roots are real and distinct");
        } else if (d == 0) {
            System.out.println("Roots are real and equal");
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}
