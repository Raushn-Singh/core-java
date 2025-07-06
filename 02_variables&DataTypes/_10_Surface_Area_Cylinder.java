
import java.util.Scanner;

public class _10_Surface_Area_Cylinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f, radius, height, res;
        System.out.println("Enter the radius of the cylinder:");
        radius = sc.nextFloat();
        System.out.println("Enter the height of the cylinder:");
        height = sc.nextFloat();
        res = 2 * pi * radius * radius + 2 * pi * radius * height;
        System.out.println("The surface area of the cylinder is: " + res);
    }
}
