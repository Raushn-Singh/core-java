
import java.util.Scanner;

public class _11_Surface_Area_Cube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, res;
        System.out.println("Enter the side of the cube:");
        a = sc.nextFloat();
        res = 6 * a * a;
        System.out.println("The surface area of the cube is: " + res);
    }
}
