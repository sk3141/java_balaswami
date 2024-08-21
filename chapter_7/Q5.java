package chapter_7;
import java.util.Scanner;
public class Q5 {
  public static void main(String args[])
  {
    int number = 0;
    int result = 0;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number to be reversed : ");
    number = s.nextInt();

    while (number > 0)
    {
      result = result * 10 + (number % 10);
      number = number / 10;
    } 
    System.out.println("Reversed number = " + result);
  }
}
