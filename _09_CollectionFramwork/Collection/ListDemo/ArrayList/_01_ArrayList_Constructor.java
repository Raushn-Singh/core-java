
import java.util.ArrayList;
import java.util.HashSet;

public class _01_ArrayList_Constructor {
  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<>();
    al1.add("AAA");
    al1.add("BBB");
    al1.add("CCC");
    al1.add("DDD");
    al1.add("EEE");

    System.out.println(al1);

    ArrayList<String> al2 = new ArrayList<>(al1);
    System.out.println(al2);
    al2.add("AAA");
    al2.add("CCC");
    al2.add("DDD");
    System.out.println(al2);
    HashSet<String> hs = new HashSet<>();
    hs.add("AAA");
    hs.add("BBB");
    hs.add("CCC");
    hs.add("DDD");
    ArrayList<String> al3 = new ArrayList<>(hs);
    System.out.println(al3);
  }
}
