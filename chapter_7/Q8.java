package chapter_7;
import java.util.Scanner;
public class Q8 {
  public static int fibonacci(int n)
  {
    if (n == 1)
      return 0;
    else if (n == 2)
      return 1;
    
      return fibonacci(n - 1) + fibonacci(n - 2);
  }
  public static void main(String args[])
  {
    int m;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a number m : ");
    m = s.nextInt();

    for(int i = 1; i <= m; i++)
    {
      System.out.print(fibonacci(i) + "\t");
    }
  }
}
