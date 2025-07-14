
public class _07_Display_Multiplication_One_To_Eight {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(i * j + " ");
            }
            System.err.println("");
        }
    }
}
