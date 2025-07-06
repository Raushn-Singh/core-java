
import java.util.Scanner;

public class _06_VolumeOfSp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float pi = 3.14f;
        System.out.println("Enter the radius :");
        float num = sc.nextFloat();
        float res = (float) (4 / 3) * pi * num * num * num;
        System.out.println(res);

        sc.close();

    }
}
