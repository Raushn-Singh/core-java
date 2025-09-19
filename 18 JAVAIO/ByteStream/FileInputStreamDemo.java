
import java.io.FileInputStream;

public class FileInputStreamDemo {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("D:\\core java\\welcome.txt");
    int x;
    while ((x = fis.read()) != -1) {
      System.out.print((char) x);
    }
    fis.close();
  }
}
