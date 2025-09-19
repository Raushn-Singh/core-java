
import java.util.Scanner;

public class _28_Prime_Factorization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to factorize: ");
        int num = sc.nextInt();
        int originalNum = num;

        System.out.println("Prime factorization of " + originalNum + ":");

        // Factor out 2s
        int count = 0;
        while (num % 2 == 0) {
            count++;
            num /= 2;
        }
        if (count > 0) {
            System.out.println("2^" + count);
        }

        // Factor out odd numbers starting from 3
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            count = 0;
            while (num % i == 0) {
                count++;
                num /= i;
            }
            if (count > 0) {
                System.out.println(i + "^" + count);
            }
        }

        // If num is a prime number greater than 2
        if (num > 2) {
            System.out.println(num + "^1");
        }

        sc.close();
    }
}
