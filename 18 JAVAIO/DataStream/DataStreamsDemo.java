
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamsDemo {
  public static void main(String[] args) throws Exception {

    DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\core java\\file1.txt"));
    dos.writeInt(100);
    dos.writeBoolean(true);
    dos.writeChar('c');
    dos.writeInt(20);
    DataInputStream dis = new DataInputStream(new FileInputStream("d:\\core java\\file1.txt"));
    System.out.println(dis.readInt());
    System.out.println(dis.readBoolean());
    System.out.println(dis.readChar());
    System.out.println(dis.readInt());
    dos.close();
    dis.close();
  }
}
