
import java.util.Scanner;

public class Ducat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        stu.inputStudentDetails(sc);
        stu.ShowStudentDetails();
    }
}
