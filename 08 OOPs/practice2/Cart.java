
import java.util.Scanner;

class Cart {

    Items grocery[];

    Cart() {
        grocery = new Items[10];
    }

    void addItems(Scanner sc) {
        for (int i = 0; i < 10; i++) {
            grocery[i] = new Items();
            grocery[i].takeInputItem(sc);
        }
    }

    void displayItems() {
        for (int i = 0; i < 10; i++) {
            grocery[i].showData();
        }
    }
}
