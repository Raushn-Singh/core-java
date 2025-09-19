// marker interface --> no abstract method in interface
// functional interface -->exactly one abstract method

@FunctionalInterface
interface Persistable {
  public void persist();
}


class Employee implements Persistable {
  public void persist() {
    System.out.println("Object Persisted Permanently");
  }

}

public class _05_FunctionalInterface {
  public static void main(String[] args) {
    Persistable p = new Employee();
    p.persist();
  }
}
