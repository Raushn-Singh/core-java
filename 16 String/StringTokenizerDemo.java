
import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("Raushan Singh");
    int count = st.countTokens();
    System.out.println("No Of Tokens : " + count);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}