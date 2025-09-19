
import java.io.FileReader;
import java.io.FileWriter;

class A {

  void fileReadOperation() throws Exception {
    // read data
    FileReader fr = new FileReader("D:\\core java\\welcome.txt");
    int x;
    while ((x = fr.read()) != -1) {
      System.out.print((char) x);
    }
    fr.close();
  }

  void fileWriteOperation() throws Exception {
    FileWriter fw = new FileWriter("D:\\core java\\welcome.txt");
    String data = "data is insert";

    fw.write(data);
    System.out.println("data");
    fw.close();
  }

  void fileCopyOperation() throws Exception {
    FileReader fr = new FileReader("D:\\core java\\welcome.txt");
    FileWriter fw = new FileWriter("D:\\core java\\file2.txt");
    int i;
    while ((i = fr.read()) != -1) {
      fw.write(i);
    }
    fr.close();
    fw.close();
  }
}

public class FileReaderDemo {
  public static void main(String[] args) throws Exception {
    A a = new A();
    // a.fileReadOperation();
    // a.fileWriteOperation();
    a.fileCopyOperation();
  }
}