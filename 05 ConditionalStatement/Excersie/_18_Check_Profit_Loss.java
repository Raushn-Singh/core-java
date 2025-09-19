
import java.util.Scanner;

public class _18_Check_Profit_Loss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount, trasaction, total;
        System.out.print("Enter the amount");
        amount = sc.nextInt();
        System.out.print("Enter the transaction");
        trasaction = sc.nextInt();

        total = amount - trasaction;
        if (total >= 0) {
            System.out.println("Profit is" + total);
        } else {
            System.err.println("Loss is :" + Math.abs(total));
        }
    }
}
