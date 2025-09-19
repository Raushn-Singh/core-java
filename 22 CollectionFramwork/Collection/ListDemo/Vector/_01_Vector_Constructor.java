
import java.util.ArrayList;
import java.util.Vector;

public class _01_Vector_Constructor {
  public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    System.out.println(v.capacity());
    System.out.println(v);

    Vector<String> v1 = new Vector<>(20);
    System.out.println(v1.capacity());

    Vector<Integer> v2 = new Vector<>();
    System.out.println(v.capacity());
    for (int i = 0; i <= 11; i++) {
      v2.add(i);
    }
    System.out.println(v2.capacity());
    for (int i = 12; i <= 21; i++) {
      v2.add(i);
    }
    System.out.println(v2.capacity());

    ArrayList<String> al = new ArrayList<>();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    Vector<String> v3 = new Vector<>(al);
    System.out.println(v3);
  }
}
