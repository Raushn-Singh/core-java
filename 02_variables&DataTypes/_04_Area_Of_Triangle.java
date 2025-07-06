
import java.util.Scanner;

public class _04_Area_Of_Triangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float base, height, res;
        System.out.println("Enter the base of the triangle:");
        base = sc.nextFloat();
        System.out.println("Enter the height of the triangle:");
        height = sc.nextFloat();

        res = (float) (1.0 / 2 * base * height);
        System.out.println("The area of the triangle is: " + res);
    }
}
