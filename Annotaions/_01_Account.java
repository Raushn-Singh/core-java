@_01_Bank_User_Defined_annotation(bid = "B-222", bname = "ICICI Bank")
public class _01_Account {
  String accNo;
  String accHolderName;
  String accType;
  int balance;

  public _01_Account(String accNo, String accHolderName, String accType, int balance) {
    this.accNo = accNo;
    this.accHolderName = accHolderName;
    this.accType = accType;
    this.balance = balance;
  }

  public void getAccountDetails() {
    System.out.println("Account Details : ");
    System.out.println("------------------");
    System.out.println("Account Number : " + accNo);
    System.out.println("Account Holder Name : " + accHolderName);
    System.out.println("Account Type : " + accType);
    System.out.println("Account Balance : " + balance);
  }
}
