package chapter_7;
import java.util.Scanner;

public class Q7 {
  public static void main(String args[])
  {
    int number;
    int sum = 0;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a number : ");
    number = s.nextInt();

    while (number > 0)
    {
      sum += number % 10;
      number /= 10;
    }

    System.out.print("Sum of digits = " + sum);
  }
}
