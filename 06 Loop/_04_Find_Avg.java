
import java.util.Scanner;

public class _04_Find_Avg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the 10 number of data :");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        double avg = sum / 10.0;
        System.err.println("Sum of 10 number is " + sum);
        System.out.println("Average of 10 number is :" + avg);

    }
}
