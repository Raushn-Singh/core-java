
import java.util.Scanner;

public class _09_Check_Coordinate {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the x axis");
        x = sc.nextInt();
        System.out.println("Enter the y axis");
        y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.err.println("Origin");
        } else if (x == 0) {
            System.out.println("Y-axis");
        } else if (y == 0) {
            System.out.println("X-axis");
        } else if (x > 0 && y > 0) {
            System.out.print("First Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.print("Fourth Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.print("Second Quadrant");
        } else  {
            System.out.print("Third Quadrant");
        }

    }
}
