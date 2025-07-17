
import java.util.Scanner;

public class _19_Count_Sum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int num = n;
        while (num != 0) {
            int rem = num % n;
            if (rem % 2 == 0) {
                countEven++;
                sumEven += rem;
            } else {
                countOdd++;
                sumOdd += rem;
            }
            num /= 10;

        }
        System.out.println("The Sum of odd :" + sumOdd);
        System.out.println("The Sum of Even  :" + sumEven);
        System.out.println("The count of odd " + countOdd);
        System.out.println("The Count of Even :" + countEven);
    }

}
