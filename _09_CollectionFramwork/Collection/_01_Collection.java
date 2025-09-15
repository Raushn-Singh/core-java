import java.util.HashSet;

public class _01_Collection {
  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();
    System.out.println(hs.add("AAA")); // true
    System.out.println(hs.add("AAA")); // false
    System.out.println(hs.add("AAA")); // false
    System.out.println(hs.add("AAA")); // false
  }
}