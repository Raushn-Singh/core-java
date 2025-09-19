
import java.util.Scanner;

public class _06_Fahrenheit_To_Celsius {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float Fahrenheit, res;
        System.out.println("Enter the temperature in Fahrenheit:");

        Fahrenheit = sc.nextFloat();
        res = (5.0f / 9) * (Fahrenheit - 32);
        System.out.println("Temperature in Celsius is: " + res);
    }
}
