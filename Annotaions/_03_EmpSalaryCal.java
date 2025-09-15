
class Employee {
  @Deprecated
  public void generateSalary() {
    System.out.println("salary is generated on the basis of the factors like basic , Hk, TA");
  }

  public void generatedSalaryNew() {
    System.out.println("Salary is calcualted on the basis of the facotrs like basic,Hk,TA,Bonus,PF");
  }
}

public class _03_EmpSalaryCal {
  public static void main(String[] args) {
    Employee emp = new Employee();
    // emp.generateSalary();// Recompile with -Xlint:deprecation for details.
    emp.generatedSalaryNew();
  }
}
