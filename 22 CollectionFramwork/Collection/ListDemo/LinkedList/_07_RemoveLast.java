
import java.util.LinkedList;

public class _07_RemoveLast {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("AAA");
    ll.add("BBB");
    ll.add("CCC");
    ll.add("DDD");
    ll.add("EEE");
    System.out.println(ll.removeLast());
  }
}
