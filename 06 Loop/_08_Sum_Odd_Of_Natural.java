
import java.util.Scanner;

public class _08_Sum_Odd_Of_Natural {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("The Sum of Odd Natural Number :" + sum);

    }
}
