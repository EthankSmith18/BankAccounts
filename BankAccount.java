public class BankAccount {
  private double checkingBalance;
  private double savingsBalance;
  private double savingsDeposit;
  private double checkingDeposit;
  private static double numberAccounts;
  private static double totalMoney;

  public BankAccount(double checkingBalance, double savingsBalance){
    numberAccounts ++;
    this.checkingBalance = checkingBalance;
    this.savingsBalance = savingsBalance;
  }

  public double getCheckingBalance() {
    return this.checkingBalance;
  }

  public void setCheckingBalance(double checkingBalance) {
    this.checkingBalance = checkingBalance;
  }

  public double getSavingsBalance() {
    return this.savingsBalance;
  }

  public void setSavingsBalance(double savingsBalance) {
    this.savingsBalance = savingsBalance;
  }

  public double getNumberAccounts() {
    return this.numberAccounts;
  }

  public void setNumberAccounts(double numberAccounts) {
    this.numberAccounts = numberAccounts;
  }

  public double getTotalMoney() {
    return this.totalMoney;
  }

  public void setTotalMoney(double totalMoney) {
    this.totalMoney = totalMoney;
  }

  public void deposit(double savingsDeposit, double checkingDeposit) {
    this.savingsBalance += savingsDeposit;
    this.checkingBalance += checkingDeposit;    
  }

  public void getTotal(){
    System.out.printf("Your current Savings Balance is: %s. %n",this.savingsBalance);
    System.out.printf("Your current Checking Balance is: %s. %n",this.checkingBalance);    

  }

  public void withdrawChecking(double withdrawl) {
    if (withdrawl > this.checkingBalance) {
      System.out.println("Insufficient Funds.");
      
    } else {
      this.checkingBalance -= withdrawl;
      System.out.printf("Your current balnce is: %s", this.checkingBalance);
    }
    
  }




}
