import java.util.LinkedList;

public class _04_GetFirst_Method {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("AAA");
    ll.add("BBB");
    ll.add("CCC");
    ll.add("FFF");
    ll.add("DDD");
    System.out.println(ll);
    System.out.println(ll.getFirst());
  }
}
