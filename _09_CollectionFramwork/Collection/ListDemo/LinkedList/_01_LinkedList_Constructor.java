
import java.util.HashSet;
import java.util.LinkedList;

public class _01_LinkedList_Constructor {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("AAA");
    ll.add("BBB");
    ll.add("CCC");
    ll.add("DDD");
    System.out.println(ll);

    LinkedList<String> lll = new LinkedList<>(ll);
    System.out.println(lll);

    HashSet<String> hs = new HashSet<>();
    hs.add("AAA");
    hs.add("BBB");

  }
}
