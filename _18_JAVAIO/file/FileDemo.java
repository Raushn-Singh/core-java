import java.io.File;
import java.io.IOException;

public class FileDemo {
  public static void main(String[] args) throws IOException {
    File f = new File("a.text");
    System.out.println(f.exists());
    System.out.println(f.canWrite());
    System.out.println(f.length());

    f.createNewFile();

    System.out.println(f.exists());

  }
}
