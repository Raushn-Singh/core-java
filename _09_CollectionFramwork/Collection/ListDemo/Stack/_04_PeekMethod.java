
import java.util.Stack;

public class _04_PeekMethod {
  public static void main(String[] args) {
    Stack<String> st = new Stack<>();
    st.push("AAA");
    st.push("BBB");
    st.push("CCC");
    st.push("DDD");
    System.out.println(st);
    System.out.println(st.peek());
  }
}
