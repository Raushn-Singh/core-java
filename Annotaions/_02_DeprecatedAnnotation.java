
import java.awt.Color;
import java.awt.Frame;

public class _02_DeprecatedAnnotation {
  public static void main(String[] args) {
    Frame f = new Frame();
    f.setSize(500, 500);
    // f.show(); -----> deprecated
    f.setVisible(true);
    f.setBackground(Color.BLACK);
    System.out.println("Hello world");
  }
}
