// Inheritance
// Polymorphism
//abstraction
//Encapsulation


import java.util.Scanner;

public class Data {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart c = new Cart();
        c.addItems(sc);
        c.displayItems();


    }
}
