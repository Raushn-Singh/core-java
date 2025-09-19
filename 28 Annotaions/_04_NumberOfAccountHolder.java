
import java.util.*;

class Bank {
  @SuppressWarnings("unchecked")
  public void listCustomerNames() {
    // ArrayList al = new ArrayList();//Note: _04_NumberOfAccountHolder.java uses
    // unchecked or unsafe operations.
    // Note: Recompile with -Xlint:unchecked for details.
    // ArrayList<String> al = new ArrayList<>(); this is correct way

    ArrayList al = new ArrayList();
    al.add("AAA");
    al.add("BBB");
    al.add("CCC");
    al.add("DDD");
    al.add("EEE");
    System.out.println(al);
  }
}

public class _04_NumberOfAccountHolder {
  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.listCustomerNames();
  }
}

// javac -Xlint:unchecked Test.java
