
import java.util.ArrayList;

public class _02_ArrayList_Method {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    System.out.println(al);
    al.add("BBB");
    System.out.println(al);
    al.add(new Integer(10));
    al.add(null);
    al.add(null);
    System.err.println(al);
  }
}
