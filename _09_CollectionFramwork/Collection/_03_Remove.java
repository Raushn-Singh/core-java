
import java.util.ArrayList;

public class _03_Remove {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("EEE");
    System.out.println(al);
    System.out.println(al.remove("BBB"));
    System.out.println(al);
    System.out.println(al.remove("zzz"));
    System.out.println(al);
  }

}
