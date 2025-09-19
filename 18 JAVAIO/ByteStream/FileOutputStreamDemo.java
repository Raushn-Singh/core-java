
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("D:\\core java\\welcome.txt");
    String data = "Welcome to FileOutputStream";
    byte[] b = data.getBytes();
    fos.write(b);
    System.out.println(b);
    fos.close();
  }
}
