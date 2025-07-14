
import java.util.Scanner;

public class _01_Print_Countries_States_Population {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Countries[] = {"India", "America", "Australia"};
        String States[][] = {{"MP", "UP", "HR", "WB"},
        {"NYC", "california", "Alaska"},
        {"Melburne", "Sydeny"},};

        float[][] Population = new float[Countries.length][];
        for (int i = 0; i < Countries.length; i++) {
            Population[i] = new float[States[i].length];
        }

        for (int i = 0; i < Countries.length; i++) {
            for (int j = 0; j < States[i].length; j++) {
                System.out.println("Countries " + Countries[i]);
                System.out.println("States Name" + States[i][j]);

                Population[i][j] = sc.nextFloat();
            }
        }
    
        System.out.println("\n--- Population Data ---");
        for (int i = 0; i < Countries.length; i++) {
            System.out.println("Country: " + Countries[i]);
            for (int j = 0; j < States[i].length; j++) {
                System.out.println("  State: " + States[i][j] + " -> Population: " + Population[i][j]);
            }
        }
    }
}
