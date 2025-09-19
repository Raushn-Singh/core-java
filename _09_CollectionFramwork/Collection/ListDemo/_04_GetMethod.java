
import java.util.ArrayList;

public class _04_GetMethod {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    System.out.println(al);
    System.out.println(al.get(2));
    System.out.println(al.get(al.size()));
  }

}