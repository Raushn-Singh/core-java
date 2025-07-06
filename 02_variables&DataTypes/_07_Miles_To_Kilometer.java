
import java.util.Scanner;

public class _07_Miles_To_Kilometer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double miles, res;
        System.out.println("Enter the value in miles:");
        miles = sc.nextDouble();
        res = miles * 1.609;
        System.out.println("the Kilometer is" + res);

    }
}
