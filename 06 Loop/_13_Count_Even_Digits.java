
import java.util.Scanner;

public class _13_Count_Even_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int n = num;
        int count = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Number of even " + count);
    }
}
