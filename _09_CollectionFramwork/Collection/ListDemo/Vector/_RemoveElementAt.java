import java.util.Vector;

public class _RemoveElementAt {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.addElement("AAA");
    v.addElement("BBB");
    v.addElement("CCC");
    v.addElement("DDD");
    v.removeElementAt(3);
    System.out.println(v);
  }
}
