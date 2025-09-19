
import java.util.Scanner;

public class _15_Check_Character {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sc.next().charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println("Character is digit");

        } else if (Character.isLetter(ch)) {
            System.out.println("Character is alphabet");
        } else {
            System.out.print("Character is special character");
        }
    }
}
