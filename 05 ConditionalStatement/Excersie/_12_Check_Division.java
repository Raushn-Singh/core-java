
import java.util.Scanner;

public class _12_Check_Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollno, phy, chem, computer, total;
        float avg;
        String division;
        System.out.println("Enter Roll No:");
        rollno = sc.nextInt();
        System.out.println("Enter Physics Marks:");
        phy = sc.nextInt();
        System.out.println("Enter Chemistry Marks:");
        chem = sc.nextInt();
        System.out.println("Enter Computer Marks:");
        computer = sc.nextInt();
        total = phy + chem + computer;
        avg = (float) total / 3;
        if (avg >= 80 && avg <= 100) {
            division = "First";
        } else if (avg >= 60 && avg <= 80) {
            division = "Second";
        } else if (avg >= 30 && avg <= 60) {
            division = "Third";
        } else {
            division = "Fail";
        }
        System.out.println("Roll No:" + rollno);
        System.err.println("PhySics Marks:" + phy);
        System.out.println("Chemistry Marks:" + chem);
        System.out.println("Computer Marks:" + computer);
        System.out.println("Total Marks:" + total);
        System.out.println("Average Marks:" + avg);
        System.out.println("Division:" + division);
    }
}
