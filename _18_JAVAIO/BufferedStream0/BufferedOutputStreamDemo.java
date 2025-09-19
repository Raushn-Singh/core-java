
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
  public static void main(String[] args) throws Exception {
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\core java\\welcome.txt"));
    String data = "Welcome to BufferedOutputStream";
    byte[] b = data.getBytes();
    bos.write(b);
    bos.close();
  }
}
