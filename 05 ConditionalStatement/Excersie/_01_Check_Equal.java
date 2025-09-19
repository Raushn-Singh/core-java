
import java.util.Scanner;

public class _01_Check_Equal {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");

        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Number");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Num1 and num2 are Equal");
        } else {
            System.out.print("Num1 and Num2 are not equal");
        }

    }
}
