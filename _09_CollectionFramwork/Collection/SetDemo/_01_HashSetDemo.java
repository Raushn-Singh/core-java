
import java.util.HashSet;
import java.util.Iterator;

public class _01_HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();
    // HashSet<String> hs=new HashSet<>(1,0.85f);

    hs.add("AAA");
    hs.add("BBB");
    hs.add("CCC");

    Iterator it = hs.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    HashSet<String> hs1 = new HashSet<>(hs);
    System.out.println(hs1);

    hs1.add("BBB");
    System.out.println(hs1);

    HashSet hs3 = new HashSet();
    hs3.add("AAA");
    hs3.add("BBB");
    hs3.add("CCC");
    hs3.add("DDD");
    hs3.add("EEE");
    hs3.add("FFF");
    hs3.add("GGG");
    System.out.println(hs);

    hs3.add("BBB");
    System.out.println(hs3);

    hs3.add(new Integer(10));
    System.out.println(hs);

    hs3.add(null);
    hs3.add(null);
    System.out.println(hs3);
  }
}
