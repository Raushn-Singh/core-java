
import java.util.Scanner;

public class _14_Count_Odd_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the number:");
        int n = num;
        int count = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 != 0) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Count odd Number :" + count);
    }
}
