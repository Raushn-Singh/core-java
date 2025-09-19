
import java.util.Vector;

public class _02_AddElement {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.add("AAA");
    v.add("BBB");
    v.add("CCC");
    System.out.println(v);
    v.addElement("DDD");
    v.addElement("EEE");
    v.addElement("FFF");
    System.out.println(v);
  }
}
