
import java.util.Vector;

public class _05_DeleteElement {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.addElement("AAA");
    v.addElement("BBB");
    v.addElement("CCC");
    v.addElement("DDD");
    v.addElement("CCC");
    System.out.println(v.removeElement("BBB"));// true
    System.out.println(v.removeElement("BBB"));// false
  }
}
