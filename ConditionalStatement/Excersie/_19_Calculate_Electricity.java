
import java.util.Scanner;

public class _19_Calculate_Electricity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cname;
        float cid, unitConsumed, amountCharge, SurCharge = 240.00f, netAmount = 0;
        System.out.println("Enter the customer id");
        cid = sc.nextFloat();
        System.err.println("Enter the Customer Name");
        cname = sc.next();
        System.out.println("Enter the consumed amount");
        unitConsumed = sc.nextFloat();

        if (unitConsumed >= 600) {
            netAmount = unitConsumed * 9.00f;
        } else if (unitConsumed >= 400 && unitConsumed <= 600) {

            netAmount = unitConsumed * 8.80f;
        } else if (unitConsumed >= 200 && unitConsumed <= 400) {
            netAmount = unitConsumed * 5.50f;
        } else if (unitConsumed <= 200) {
            float calculate = unitConsumed * 3.20f;
            if (calculate >= 200) {
                netAmount = calculate;
            } else {
                netAmount = 200;
            }
        }

        if (netAmount >= 1000) {
            SurCharge = netAmount * 15 / 100;
            netAmount = netAmount + SurCharge;
        }

        System.out.println("Customer id :" + cid);
        System.out.println("Customer Name :" + cname);
        System.out.println("Unit Consumed :" + unitConsumed);
        System.out.println("Total :" + netAmount);

    }
}
