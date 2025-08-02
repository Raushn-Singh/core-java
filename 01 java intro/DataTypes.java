
import java.util.Scanner;

public class DataTypes {

    public static void main(String args[]) {
        // data type --> it is use to specify the category of data
        //primitive data type can hold single value.
        //non primitive data type can hold multiple value.
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();
        long mobileNo = 8484848484L; // jb v predefiend vaue long and float me dali jati hai tb value ke last me long ke li (L/l) and float ke liye (F/f) likha jata
        
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        
        boolean bool = sc.nextBoolean();
        
        char gender = sc.next().charAt(0);

        System.out.println(" ");

    }
}
