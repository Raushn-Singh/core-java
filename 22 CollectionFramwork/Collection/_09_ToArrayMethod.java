
import java.util.ArrayList;

public class _09_ToArrayMethod {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("FFF");
    Object[] elements = al.toArray();
    for (Object elem : elements) {
      System.out.println(elem);
    }
  }
}
