
import java.util.ArrayList;

public class _01_Add {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add(2, "DDD");
    al.add(3, "EEE");
    System.out.println(al);
    al.add(8, "element");// index out of bound
  }
}
