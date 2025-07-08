
import java.util.Scanner;

public class _07_Check_Person_Categorize {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("Enter Ypur Height in CM :");
        height = sc.nextInt();
        if (height >= 180) {
            System.out.print("the person is Tall");
        } else if (height >= 150 && height <= 180) {
            System.out.print("the person is Medium");
        } else if (height >= 0 && height <= 150) {
            System.out.println("the person is Dwarf");
        }
    }
}
