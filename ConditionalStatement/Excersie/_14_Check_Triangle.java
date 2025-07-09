
import java.util.Scanner;

public class _14_Check_Triangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter the side of Triangle :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.print("Equilateral Triangle");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

        }

    }
}
