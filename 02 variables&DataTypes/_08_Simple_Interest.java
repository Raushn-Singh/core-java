
import java.util.Scanner;

public class _08_Simple_Interest {

    public static void main(String args[]) {
        float principal, rate, time, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        principal = sc.nextFloat();
        System.out.println("Enter the rate of interest:");
        rate = sc.nextFloat();
        System.out.println("Enter the time period:");
        time = sc.nextFloat();

        res = (principal * time * rate) / 100;
        System.out.println("Simple Interest is: " + res);
        sc.close();
    }
}
