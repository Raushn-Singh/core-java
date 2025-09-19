
import java.util.Scanner;

public class _05_Celsius_To_Fahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float celsius, res;
        celsius = sc.nextFloat();
        res = (celsius * 9.0f / 5.0f) + 32;
        System.out.println(res);
    }
}
