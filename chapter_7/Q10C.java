package chapter_7;

public class Q10C {
  public static void main(String args[])
  {
    for (int i = 1; i <= 5; i++)
    {
      for (int k = 1; k <= 5 - i; k++)
      {
        System.out.print(" ");
      }
      for (int j = i; j > 0; j--)
      {
        System.out.print(i + " ");
      }
      System.out.print("\n");
    }
  }
}
