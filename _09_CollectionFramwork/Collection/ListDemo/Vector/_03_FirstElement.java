
import java.util.Vector;

public class _03_FirstElement {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.add("AAA");
    v.addElement("BBB");
    v.addElement("CCC");
    v.addElement("DDD");
    System.out.println(v.firstElement());

  }
}
