package chapter_7;

public class Q10B {
  public static void main(String args[])
  {
    for (int i = 5; i >= 1; i--)
    {
      for (int k = 0; k < 5 - i; k++)
      {
        System.out.print(" ");
      }
      for (int j = i; j > 0; j--)
      {
        System.out.print("$");
      }
      System.out.print("\n");
    }
  }
}
