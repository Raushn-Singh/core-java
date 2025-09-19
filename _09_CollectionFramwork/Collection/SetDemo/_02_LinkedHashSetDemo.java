
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _02_LinkedHashSetDemo {
  public static void main(String[] args) {
    LinkedHashSet<String> hls = new LinkedHashSet<>();
    hls.add("AAA");
    hls.add("BBB");
    hls.add("CCC");
    hls.add("DDD");
    hls.add("EEE");
    hls.add("FFF");
    System.out.println(hls);

    HashSet<String> hs = new HashSet<>();
    hs.add("AAA");
    hs.add("BBB");
    hs.add("CCC");
    hs.add("DDD");
    hs.add("EEE");
    System.out.print(hs);
  }
}
