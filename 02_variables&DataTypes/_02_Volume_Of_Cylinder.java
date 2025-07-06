
import java.util.Scanner;

public class _02_Volume_Of_Cylinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f, radius, height, res;

        System.out.print("Enter the radius of the cylinder: ");
        radius = sc.nextFloat();

        System.out.println("Enter the height of the cylinder:");
        height = sc.nextFloat();
        res = pi * radius * radius * height;
        System.out.println("the volume of cylinder is " + res);

    }

}
