public class _01_BankMain {
  public static void main(String[] args) throws Exception {
    _01_Account acc = new _01_Account("abc123", "Raushan", "Savings", 5000);
    acc.getAccountDetails();
    Class c = Class.forName("_01_Account");
    java.lang.annotation.Annotation ann = c.getAnnotation(_01_Bank_User_Defined_annotation.class);
    _01_Bank_User_Defined_annotation b = (_01_Bank_User_Defined_annotation) ann;
    System.out.println("Bank Details");
    System.out.println("------------");
    System.out.println("Bank Id : " + b.bid());
    System.out.println("Bank Name : " + b.bname());
    System.out.println("Branch : " + b.branch());
  }
}
