
import java.util.Scanner;

public class _17_Check_Vowel_Consonant {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the alphabet");

        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Alphabet is Vowel");
        } else {
            System.out.println("Alphabet is Consonant ");
        }
    }
}
