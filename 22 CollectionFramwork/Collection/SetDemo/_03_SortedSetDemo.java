
import java.util.SortedSet;
import java.util.TreeSet;

public class _03_SortedSetDemo {
  public static void main(String[] args) {
    SortedSet<String> ss = new TreeSet<>();
    ss.add("FFF");
    ss.add("CCC");
    ss.add("AAA");
    ss.add("EEE");
    ss.add("DDD");
    ss.add("BBB");
    System.out.println(ss);
    System.out.println(ss.first());
    System.out.println(ss.last());
    System.out.println(ss.headSet("DDD"));
    System.out.println(ss.tailSet("DDD"));
    System.out.println(ss.subSet("BBB", "CCC"));

  }
}
