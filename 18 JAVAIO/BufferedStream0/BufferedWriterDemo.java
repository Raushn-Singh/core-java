
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\core java\\welcome.txt"));
    String str = "Welcome to bufferedWriter";
    bw.write(str);
    bw.close();
  }
}
