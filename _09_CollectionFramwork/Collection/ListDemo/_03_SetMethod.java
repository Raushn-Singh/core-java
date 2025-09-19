
import java.util.ArrayList;

public class _03_SetMethod {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("EEE");
    al.add("EEE");
    System.out.println();
    // al.set(7, "GGG");// index out of bound
    al.set(3, "element");
    System.out.println(al);
  }
}
