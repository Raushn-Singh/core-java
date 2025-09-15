
import java.util.ArrayList;

public class _07_RetainAll {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("EEE");
    al.add("FFF");
    System.out.println(al);
    ArrayList<String> al2 = new ArrayList<>();
    al2.add("CCC");
    al2.add("DDD");
    al2.add("EEE");
    System.out.println(al2);
    System.out.println(al.retainAll(al2));
    System.out.println(al);
    System.out.println(al.retainAll(al2));

  }
}
