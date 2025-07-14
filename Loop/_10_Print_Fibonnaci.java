
import java.util.Scanner;

public class _10_Print_Fibonnaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number  :");
        int n = sc.nextInt();
        int first = 0, second = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
