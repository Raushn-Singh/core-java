class DBDriver {
  public void getDriver() {
    System.out.println("Type 1 Driver ");
  }
}

class NewDbDriver extends DBDriver {
  @Override
  public void getDriver() {
    System.out.println("Type 4 Driver");
  }

}

public class _01_OverrideAnnotation {
  public static void main(String[] args) {
    DBDriver db = new NewDbDriver();
    db.getDriver();
  }
}
