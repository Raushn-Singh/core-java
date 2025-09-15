
import java.util.ArrayList;

public class _10_IsEmpty {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("EEE");
    System.out.println(al.isEmpty());
    System.out.println(al);
    al.clear();
    System.out.println(al.isEmpty());
  }
}
