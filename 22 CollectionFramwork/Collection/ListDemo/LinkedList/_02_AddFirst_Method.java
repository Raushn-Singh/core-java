
import java.util.LinkedList;

public class _02_AddFirst_Method {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("AAA");
    ll.add("BBB");
    ll.add("CCC");
    ll.add("DDD");
    System.out.println(ll);
    ll.addFirst("EEE");
    ll.addFirst("FFF");
    System.out.println(ll);
  }
}
