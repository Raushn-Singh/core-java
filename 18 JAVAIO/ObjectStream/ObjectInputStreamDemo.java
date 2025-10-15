
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable// marker Interface
{
  int id = 101;
  String name = "Raushan";
  String email = "raushan@786267@gmail.com";
  transient String password = "1234";

}

public class ObjectInputStreamDemo {
  public static void main(String[] args) throws Exception {
    A a = new A();
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\core java\\data.ser"));
    oos.writeObject(a);
    oos.close();
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\core java\\data.ser"));
    A obj = (A) ois.readObject();
    System.out.print(obj.id + " " + obj.name + " " + obj.email + " " + obj.password);

    ois.close();
  }
}
