
import java.util.Scanner;

public class _13_Check_Temperature {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter the temperature in degree celsius:");
        temp = sc.nextInt();
        if (temp >= 40) {
            System.out.println("its is very Hot");
        } else if (temp >= 40 && temp <= 30) {
            System.out.println("its is hot");
        } else if (temp >= 30 && temp <= 20) {
            System.out.println("its is normal");
        } else if (temp >= 20 && temp <= 10) {
            System.out.println("its is cold");
        } else if (temp >= 10 && temp <= 0) {
            System.out.println("its is very cold");
        } else {
            System.out.print("Freezing Weather");
        }
    }
}
