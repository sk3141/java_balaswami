package chapter_7;
import java.util.Scanner;

public class Q6 {
  public static long factorial(int n)
  {
    if (n == 1 || n == 0)
      return 1;
    return n * factorial(n - 1);
  }
  public static void main(String args[])
  {
    int m;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a number m : ");
    m = s.nextInt();
    while (m > 0)
    {
      System.out.printf("%d! = %d\n", m, factorial(m));
      m -= 1;
    }

  }
}
