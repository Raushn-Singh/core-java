
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
  public static void main(String[] args) throws Exception {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\core java\\welcome.txt"));
    int x;
    while ((x = bis.read()) != -1) {
      System.out.println((char) x);
    }
    bis.close();
  }
}
