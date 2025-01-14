package chapter_8;
import java.util.Scanner;
class BankAccount {
  private String depositorName;
  private String accountNumber;
  private String accountType;
  private double balance;

  public void openAccount() {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter Depositor name : ");
    this.depositorName = s.nextLine();
    System.out.print("Enter Account number : ");
    this.accountNumber = s.next();
    System.out.print("Enter Account type : ");
    this.accountType = s.next();
    System.out.print("Enter balance : ");
    this.balance = s.nextDouble();
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
public class Q16 {
  public static void main(String args[])
  {
    BankAccount acc1 = new BankAccount();
    acc1.openAccount();
    acc1.deposit(8000.00);
    acc1.withdraw(800.00);
    acc1.display();    
  }
}