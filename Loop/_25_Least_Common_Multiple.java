
import java.util.Scanner;

public class _25_Least_Common_Multiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b = sc.nextInt();

        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM IS " + lcm);

    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int next = b;
            b = b % a;
            a = next;
        }
        return a;
    }
}
