import java.util.Vector;

public class _RemoveAllElements {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.addElement("AAA");
    v.addElement("BBB");
    v.addElement("CCC");
    v.removeAllElements();
    System.out.println(v);
  }
}
