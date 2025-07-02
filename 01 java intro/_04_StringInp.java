import java.util.Scanner;

public class _04_StringInp{
  public static void main(String[] args) {
  // non primitive data type eg. String Array Class Interface Enum etc.
  // Class Is also a user defined data type
Scanner sc= new Scanner(System.in);
  String name;
  System.out.println("Enter user name");
  name =sc.next();
  System.out.println("Hello "+name);

   sc.nextLine();
  String fullName;
  System.out.println("Enter full name");
  fullName=sc.nextLine();
  System.out.println("Hello "+fullName);
  sc.close();
  }
}