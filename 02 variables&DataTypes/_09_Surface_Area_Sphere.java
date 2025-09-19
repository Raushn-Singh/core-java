
import java.util.Scanner;

public class _09_Surface_Area_Sphere {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius, pi = 3.14f, res;
        System.out.println("Enter the Radius of the sphere :");
        radius = sc.nextInt();
        res = 4 * pi * radius * radius;
        System.out.println("The surface area of the sphere is " + res);

    }
}
