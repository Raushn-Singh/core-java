
import java.util.Scanner;

public class _01_Volume_Of_Cone {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f, radius, height, res;
        System.out.println("Enter the Radius of the cone :");
        radius = sc.nextFloat();
        System.out.println("Enter the Height of the cone :");

        height = sc.nextFloat();
        res = (1.0f / 3) * (pi * radius * radius * height);

        System.out.println("The volume  of Cone " + res);

    }
}
