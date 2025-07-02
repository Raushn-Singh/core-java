import java.util.Scanner;

public class _03_DataTypes{
  public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      //data type :
      // there two types of data types in java
      // 1. primitive data types -->Single value
      // 2.non-primitive data types  -->can store multiple values
      

     // primitive data types
      System.out.println("Enter values :");

      byte b=sc.nextByte(); // 1byte
      short s=sc.nextShort(); // 2byte

      int i=sc.nextInt();// 4byte
      long l=sc.nextLong(); //8 byte

      float f=sc.nextFloat(); // 4 byte
      double d=sc.nextDouble(); // 8 byte
      boolean isAlive=sc.nextBoolean(); // 1 byte
      char gender =sc.next().charAt(0); // 2 byte
      
      
      System.out.println("the value are :");
      System.out.println("byte : "+b);
      System.out.println("short :"+s);
      System.out.println("int : "+i);
      System.out.println("long : "+l);
      System.out.println("float : "+f);
      System.out.println("Doble :"+d);
      System.out.println("boolean : "+b);
      System.out.println("char :" +gender);
    }
}