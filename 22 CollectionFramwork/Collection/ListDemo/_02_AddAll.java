
import java.util.ArrayList;

public class _02_AddAll {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("EEE");
    System.out.println(al);
    ArrayList<String> al2 = new ArrayList<>();
    al2.add("AAA");
    al2.add("BBB");
    al2.add("CCC");
    al.addAll(2, al2);
    System.out.println(al);
  }
}
