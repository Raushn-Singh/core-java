
import java.util.Scanner;

class Items {

    String name;
    int quantity;
    double price;
    double total;

    Items() {

    }

    Items(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void takeInputItem(Scanner sc) {
        System.out.println("Enter the Name Of Item :");
        this.name = sc.nextLine();
        System.out.println("Enter the Quantity Of Item :");
        this.quantity = sc.nextInt();
        System.out.println("Enter the Price Of Item :");
        this.price = sc.nextDouble();

    }

    void showData() {
        System.out.println("Name Of Item : " + this.name);

        System.out.println("Quantity Of Item : " + this.quantity);

        System.out.println("Price of Quantity" + this.price);
        total = price * quantity;
        System.out.println("Total Price Of Item : " + this.total);
    }

}
