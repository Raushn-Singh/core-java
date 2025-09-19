import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class _05_TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>();

    ts.add("AAA");
    ts.add("BBB");
    ts.add("CCC");
    ts.add("DDD");
    ts.add("EEE");
    System.out.println(ts);

    SortedSet<String> ss = new TreeSet<>();
    ss.add("AAA");
    ss.add("GGG");
    ss.add("HHH");
    TreeSet<String> ts1 = new TreeSet<>(ss);
    System.out.println(ts1);

    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("FFF");
    al.add("GGG");
    al.add("CCC");
    al.add("BBB");
    al.add("DDD");
    System.out.println(al);
    TreeSet<String> ts3 = new TreeSet<>(al);
    System.out.println(ts3);
     
    TreeSet ts4 = new TreeSet();
    ts4.add("AAA");
    ts4.add("BBB");
    ts4.add("CCC");
    System.out.println(ts4);

    ts4.add("BBB");
    System.out.println(ts4);

    // ts4.add(new Integer(10)); -->java.lang.ClassCastException
    // ts4.add(null); -->java.lang.ClassCastException
    // ts4.add(new StringBuffer("ZZZ")); --> java.lang.ClassCastException
    
    



  }
}
