
import java.util.Scanner;

public class _03_Volume_Of_Cube {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius, res;
        System.out.println("Enter the radius of the cube:");
        radius = sc.nextFloat();
        res = radius * radius * radius;
        System.out.println("The volume of the cube is: " + res);

    }
}
