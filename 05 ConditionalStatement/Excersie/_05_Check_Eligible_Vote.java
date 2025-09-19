
import java.util.Scanner;

public class _05_Check_Eligible_Vote {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int age;
        System.out.println("Ente the Age");
        age = Sc.nextInt();
        if (age >= 18) {
            System.out.println("Congratulation! You are eligible for casting your vote.");

        } else {
            System.out.println("Sorry! You are not eligible for casting your vote.");
        }
    }
}
