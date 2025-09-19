
import java.util.ArrayList;

public class _05_RemoveMethod {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("EEE");
    System.out.println(al);
    System.out.println(al.remove(2));
    System.out.println(al);
    System.out.println(al.remove(4));
  }
}
