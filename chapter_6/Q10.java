import java.lang.Math;

public class Q10 {
  public static void main(String args[])
  {
    System.out.printf("SQUARE ROOT TABLE \n\n");
    System.out.printf("Number ");
    for (double i = 0; i < 1.0; i += 0.1)
    {
      System.out.printf("%-5.1f", i);
    }
    System.out.printf("\n");
    for (double i = 0; i <= 9.0; i++)
    {
      System.out.printf("%11.1f", i);
      for (double j = 0; j < 1.0; j += 0.1)
      {
        System.out.printf("%5.1f", Math.sqrt(i + j));
      }
      System.out.printf("\n");
    }
  }
}
