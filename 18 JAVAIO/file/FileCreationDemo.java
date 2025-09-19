import java.io.File;

public class FileCreationDemo {
  public static void main(String[] args) {
    try {
      File file = new File("abc.txt");
      if (file.createNewFile()) {
        System.out.println("File is created" + file.getName());
      } else {
        System.out.println("File already exists");
      }
    } catch (Exception e) {
      System.out.println("An error occured");
      e.printStackTrace();
    }
  }
}
