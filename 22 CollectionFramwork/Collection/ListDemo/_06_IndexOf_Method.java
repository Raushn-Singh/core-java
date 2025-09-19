
import java.util.ArrayList;

public class _06_IndexOf_Method{
 public static void main(String[] args) {
  ArrayList<String> al=new ArrayList<>();
  al.add("AAA");
  al.add("CCC");
  al.add("BBB");
  al.add("DDD");
  al.add("EEE");
  al.add("FFF");
  al.add("GGG");
  al.add("BBB");
  System.out.println(al);
  System.out.println(al.indexOf("BBB"));
  System.out.println(al.lastIndexOf("BBB"));
 }
}