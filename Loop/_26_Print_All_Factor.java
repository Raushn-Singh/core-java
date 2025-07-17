
import java.util.Scanner;

public class _26_Print_All_Factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
