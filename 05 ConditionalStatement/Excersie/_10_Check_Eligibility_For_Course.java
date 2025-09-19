
import java.util.Scanner;

public class _10_Check_Eligibility_For_Course {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int math, phy, chem, total, phyMathTotal;
        System.out.println("Enter the marks of math:");
        math = sc.nextInt();
        System.out.println("Enter the marks of phy:");
        phy = sc.nextInt();
        System.out.println("Enter the marks of chem:");
        chem = sc.nextInt();
        total = math + phy + chem;
        phyMathTotal = math + phy;

        if (total >= 170 && phyMathTotal >= 140 && math >= 65 && phy >= 55 && chem >= 50) {
            System.out.println("Eligible for the course");
        } else {
            System.out.println("Not Eligible for the course");
        }

    }
}
