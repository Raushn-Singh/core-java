
import java.util.LinkedList;

public class _03_AddLast_Method {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("AAA");
    ll.add("CCC");
    ll.add("BBB");
    ll.add("DDD");
    System.out.println(ll);
    ll.addFirst("FFF");
    ll.addLast("GGG");
    ll.addLast("SSS");
    System.out.println(ll);
  }
}
