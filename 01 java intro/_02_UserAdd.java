import java.util.Scanner;

public class _02_UserAdd{
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int num1,num2,result;
   System.out.println("Enter the first number");
     num1=sc.nextInt();
    System.out.println("Enter the value of num2");
    num2=sc.nextInt();
    result=num1+num2;
    System.out.println("The sum of the two numbers is "+result);
   sc.close();

  }
}