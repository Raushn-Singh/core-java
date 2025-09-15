
import java.util.ArrayList;

public class _05_Contains {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("EEE");
    System.out.println(al);
    System.out.println(al.contains("BBB"));
    System.out.println(al.contains("YYY"));

  }
}
