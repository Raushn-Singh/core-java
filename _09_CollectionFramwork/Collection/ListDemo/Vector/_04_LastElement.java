
import java.util.Vector;

public class _04_LastElement {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.addElement("AAA");
    v.addElement("BBB");
    v.addElement("CCC");
    v.addElement("DDD");
    System.out.println(v.lastElement());
  }
}
