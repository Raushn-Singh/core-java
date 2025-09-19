
import java.util.Stack;

public class _02_PopMethod {
  public static void main(String[] args) {
    Stack<String> st = new Stack<>();
    st.push("AAA");
    st.push("BBB");
    st.push("BBB");
    st.push("CCC");
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st);
  }
}
