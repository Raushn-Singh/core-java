
import java.util.Scanner;

public class _27_Sum_Of_Factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        System.out.println("Sum is " + sum);
    }
}
