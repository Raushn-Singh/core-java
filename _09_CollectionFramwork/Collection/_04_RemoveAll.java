
import java.util.ArrayList;

public class _04_RemoveAll {
  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<>();
    al1.add("AAA");
    al1.add("BBB");
    al1.add("CCC");
    al1.add("DDD");
    al1.add("EEE");
    al1.add("FFF");
    System.out.println(al1);
    ArrayList<String> al2 = new ArrayList<>();
    al2.add("CCC");
    al2.add("DDD");
    // System.out.println(al2);
    // System.out.println(al1.removeAll(al2));
    // System.out.println(al1);
    // System.out.println(al1.removeAll(al2));
    // System.out.println(al1);
    al2.add("YYY");
    al2.add("ZZZ");
    System.out.println(al1.removeAll(al2));
    System.out.println(al1);
  }
}
