
import java.util.HashSet;

public class _02_AddAll {
  public static void main(String[] args) {
    HashSet<String> hs1 = new HashSet<>();
    hs1.add("AAA");
    hs1.add("BBB");
    hs1.add("CCC");
    hs1.add("DDD");
    System.out.println(hs1);
    HashSet<String> hs2 = new HashSet<>();
    // System.out.println(hs2.addAll(hs1)); // true
    // System.out.println(hs2.addAll(hs1)); // false

    hs2.add("AAA");
    hs2.add("BBB");
    System.out.println(hs2.addAll(hs1));
  }
}
