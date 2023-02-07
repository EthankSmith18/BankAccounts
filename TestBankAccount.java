public class TestBankAccount {
  public static void main(String[] args) {

    BankAccount account1 = new BankAccount(100, 100);
    account1.deposit(10, 10);
    System.out.println(account1.getCheckingBalance());
    System.out.println(account1.getSavingsBalance());
    account1.getTotal();
    account1.withdrawChecking(10);
    
    
  }

}