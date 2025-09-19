
import java.util.ArrayList;
import java.util.Iterator;

public class _01_IteratorDemo {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("FFF");
    Iterator<String> it = al.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());

    }
  }
}
