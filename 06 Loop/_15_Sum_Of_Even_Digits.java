
import java.util.Scanner;

public class _15_Sum_Of_Even_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                sum += r;
            }
            n /= 10;
        }

        System.out.println("The sum of even digits" + sum);
    }
}
