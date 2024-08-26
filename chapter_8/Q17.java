package chapter_8;
import java.util.Scanner;

class BankAccount {
  private String depositorName;
  private String accountNumber;
  private String accountType;
  private double balance;

  public BankAccount(String depositorName, String accountNumber, String accountType, double balance) {
    this.depositorName = depositorName;
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.balance = balance;
}

  public void deposit(double amount) {
    if (amount < 0) {
      System.out.println("Deposit Failed : Invalid amount");
      return;
    }

    this.balance += amount;
    System.out.println("Amount deposited");
  }

  public void withdraw(double amount) {
    if (amount >= this.balance) {
      System.out.println("Withdrawl failed : Invalid amount");
      return;
    }
    this.balance -= amount;
    System.out.println("Amount withdrawn");
  }

  public void display() {
    System.out.println("Account holder name : " + this.depositorName);
    System.out.println("Balance : " + this.balance);
  }
}
public class Q17 {
  public static void main(String args[])
  {
    BankAccount acc1 = new BankAccount("Sahil Kaundal", "87678567", "savings", 8000.00);

    acc1.deposit(8000.00);
    acc1.withdraw(800.00);
    acc1.display();    
  }
}