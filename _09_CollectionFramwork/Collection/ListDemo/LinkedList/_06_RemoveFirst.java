
import java.util.LinkedList;

public class _06_RemoveFirst {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("AAA");
    ll.add("BBB");
    ll.add("CCC");
    ll.add("DDD");
    System.err.println(ll.removeFirst());
  }
}
