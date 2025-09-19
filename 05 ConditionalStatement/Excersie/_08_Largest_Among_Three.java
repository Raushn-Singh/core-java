
import java.util.Scanner;

public class _08_Largest_Among_Three {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        num2 = sc.nextInt();
        System.out.println("Enter the Third Number");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print("Num1 is the largest value" + num1);
        } else if (num2 > num3) {
            System.err.println("Num2 is the largest value" + num2);
        } else {
            System.out.println("Num3 is the largest value" + num3);
        }

        sc.close();
    }
}
