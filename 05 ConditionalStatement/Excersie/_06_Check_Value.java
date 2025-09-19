
import java.util.Scanner;

public class _06_Check_Value {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter the Value:");
        m = sc.nextInt();
        if (m > 0) {
            System.out.println("the value is 1");
        } else if (m < 0) {
            System.out.println("the value is -1");
        } else {
            System.out.println("the value is 0");
        }
    }
}
