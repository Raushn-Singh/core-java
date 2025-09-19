
import java.util.Scanner;

public class _02_Check_Odd_Even {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Number;
        System.out.println("Enter A number:");
        Number = sc.nextInt();
        if (Number % 2 == 0) {
            System.out.println("Number is even");

        } else {
            System.out.println("Number is odd");
        }
    }
}
