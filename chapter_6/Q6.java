public class Q6
{
  public static void main(String args[])
  {
    int count = 0;
    int sum = 0;
    for (int x = 100 + (7 - (100 % 7)); x < 200; x += 7)
    {
      count++;
      sum += x;
    }

    System.out.println("Sum = " + sum);
    System.out.println("Count = " + count);
  }
}