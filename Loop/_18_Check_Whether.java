
import java.util.Scanner;

public class _18_Check_Whether {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
            } else {
                flag = false;
            }
        }

        if (flag == true) {
            System.out.print("Number is not Prime");
        } else {
            System.out.print("Number is prime");
        }
    }
}
