
import java.util.Scanner;

class Student {

    int id;
    String name;
    String institute;
    Address localAddress;
    Address permanentAddress;

    public Student() {
        localAddress = new Address();
        permanentAddress = new Address();
    }

    public Student(int id, String name, String institute, Address localAddress, Address permanentAddress) {
        this.id = id;
        this.name = name;
        this.institute = institute;
        this.localAddress = localAddress;
        this.permanentAddress = permanentAddress;
    }

    void inputStudentDetails(Scanner sc) {
        System.out.println("Enter Student Id :");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Stduent Name :");
        name = sc.nextLine();
        System.out.println("Enter the Institute Name :");
        institute = sc.nextLine();

        System.out.println("Enter the Student Local Address :");
        if (localAddress != null) {
            localAddress.inputAddressDetails(sc);
        }
        System.out.println("Enter the student permanent address :");
        if (permanentAddress != null) {
            permanentAddress.inputAddressDetails(sc);
        }

    }

    void ShowStudentDetails() {
        System.out.println("Stduent Id :" + id);
        System.out.println("Student Name :" + name);
        System.out.println("Intitute :" + institute);
        System.out.println("Local Address :");
        if (localAddress != null) {
            localAddress.ShowAddressDetails();
        }

        System.out.println("Permanent Address :");
        if (permanentAddress != null) {
            permanentAddress.ShowAddressDetails();
        }
    }

}
