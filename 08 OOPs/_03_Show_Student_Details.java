
import java.util.Scanner;

class Student {

    String Name;
    String id;
    int age;
    String course;

    public Student() {
    }

    void inputDetails(Scanner sc) {
        System.out.println("Enter the student name");
        Name = sc.nextLine();
        System.out.println("Enter the Student Id number :");
        id = sc.nextLine();
        System.out.println("Enter the Student age :");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student Course :");
        course = sc.nextLine();

    }

    void showDetails() {
        System.out.println("Student Name :" + Name);
        System.out.println("Student ID" + id);
        System.out.println("Student age :" + age);
        System.out.println("Student Course :" + course);

    }
}

public class _03_Show_Student_Details {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Student students[] = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].inputDetails(sc);
        }

        for (int i = 0; i < students.length; i++) {
            students[i].showDetails();
        }

    }
}
