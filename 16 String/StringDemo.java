public class StringDemo {
  public static void main(String[] args) {
    String str1 = new String();
    String str2 = new String(" Raushan Singh ");
    System.out.println(str2);

    byte[] b = { 65, 66, 67, 68, 69 };
    String str3 = new String(b);
    System.out.println(str3);

    String str4 = new String(b, 3, 2);
    System.out.println(str4);
  }
}
