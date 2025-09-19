
import java.util.NavigableSet;
import java.util.TreeSet;

public class _04_NavigableSetDemo {
  public static void main(String[] args) {
    NavigableSet<String> ns = new TreeSet<>();
    ns.add("FFF");
    ns.add("AAA");
    ns.add("EEE");
    ns.add("CCC");
    ns.add("DDD");
    ns.add("CCC");
    System.out.println(ns);
    System.out.println(ns.descendingSet());
    System.out.println(ns.ceiling("DDD"));
    System.out.println(ns.higher("DDD"));
    System.out.println(ns.floor("DDD"));
    System.out.println(ns.lower("DDD"));
    System.out.println(ns.pollFirst());
    System.out.println(ns.pollLast());
    System.out.println(ns);
  }
}
