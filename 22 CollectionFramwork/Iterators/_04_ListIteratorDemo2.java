
import java.util.LinkedList;
import java.util.ListIterator;

public class _04_ListIteratorDemo2 {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("AAA");
    ll.add("BBB");
    ll.add("CCC");
    ll.add("EEE");
    ll.add("FFF");
    ListIterator<String> lit = ll.listIterator();
    while (lit.hasNext()) {
      String ele = lit.next();
      if (ele.equals("BBB")) {
        lit.remove();
      }
      if (ele.equals("DDD")) {
        lit.add("YYY");
      }
      if (ele.equals("EEE")) {
        lit.set("ZZZ");
      }
    }
    System.out.println(ll);
  }
}
