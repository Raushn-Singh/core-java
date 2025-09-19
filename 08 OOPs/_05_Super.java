
class Employee {

    int id;
    String name;

    public Employee() {
        name = "Aman Tiwari";
    }

    void showEmpDetails() {
        System.out.println("Id :" + id);
        System.out.println("name :" + name);
    }
}

class Teacher extends Employee {

    String name;

    public Teacher() {
        name = " Ducat Teacher ";
    }

    void showEmpDetails() {

        System.out.println("Id : " + id);
        System.out.println("Name : " + super.name);

    }

}

public class _05_Super {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.showEmpDetails();
    }
}
