
import java.util.Enumeration;
import java.util.Vector;

public class _02_EnumerationDemo {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.add("AAA");
    v.add("BBB");
    v.add("CCC");
    v.add("DDD");
    Enumeration en = v.elements();
    while (en.hasMoreElements()) {
      System.out.println(en.nextElement());

    }
  }
}
