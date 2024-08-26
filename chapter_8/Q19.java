package chapter_8;
import java.util.Scanner;
import java.util.Arrays;
class Account {

  protected String customerName;
  protected String accountNumber;
  protected double balance;

  public Account(String customerName, String accountNumber, double initialBalance) {
      this.customerName = customerName;
      this.accountNumber = accountNumber;
      this.balance = initialBalance;
  }

  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println("Deposited: " + amount);
      } else {
          System.out.println("Deposit amount must be positive.");
      }
  }

  public void displayBalance() {
      System.out.println("Balance: " + balance);
  }
}

class Curr_acct extends Account {
  private final double minimumBalance = 500.00;
  private final double penalty = 50.00;

  public Curr_acct(String customerName, String accountNumber, double initialBalance) {
    super(customerName, accountNumber, initialBalance);
  }
  public void checkMinimumBalance() {
      if (balance < minimumBalance) {
          balance -= penalty;
          System.out.println("Minimum balance not maintained. Penalty of " + penalty + " imposed.");
      }
  }

  public void withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
          balance -= amount;
          System.out.println("Withdrawn: " + amount);
      } else {
          System.out.println("Insufficient balance or invalid amount.");
      }
      checkMinimumBalance();
  }
}

class Sav_acct extends Account {
  private final double interestRate = 0.04; 

  public Sav_acct(String customerName, String accountNumber, double initialBalance) {
    super(customerName, accountNumber, initialBalance);
  }
  public void computeAndDepositInterest() {
      double interest = balance * interestRate;
      deposit(interest);
      System.out.println("Interest of " + interest + " deposited.");
  }

  public void withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
          balance -= amount;
          System.out.println("Withdrawn: " + amount);
      } else {
          System.out.println("Insufficient balance or invalid amount.");
      }
  }
}

public class Q19 {
  public static void main(String[] args) {
      Curr_acct currentAccount = new Curr_acct("Jane Doe", "SA987654321", 1000.00);
      currentAccount.displayBalance();
      currentAccount.deposit(200.00);
      currentAccount.withdraw(400.00);
      currentAccount.withdraw(450.00); 

      Sav_acct savingsAccount = new Sav_acct("Jane Doe", "SA987654321", 1000.00);
      savingsAccount.computeAndDepositInterest();
      savingsAccount.withdraw(200.00);
      savingsAccount.displayBalance();
  }
}
