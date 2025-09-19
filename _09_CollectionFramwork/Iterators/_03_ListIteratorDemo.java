
import java.util.LinkedList;
import java.util.ListIterator;

public class _03_ListIteratorDemo {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("AAA");
    ll.add("BBB");
    ll.add("CCC");
    ll.add("DDD");
    ll.add("EEE");
    ListIterator<String> lit = ll.listIterator();
    System.out.println("Elements in forward direction");
    while (lit.hasNext()) {
      System.err.println(lit.nextIndex() + "--->" + lit.next());
    }
    System.out.println();
    System.out.println("Element in backward direction : ");
    while (lit.hasPrevious()) {
      System.out.println(lit.previousIndex() + "--->" + lit.previous());
    }
    
  }
}
