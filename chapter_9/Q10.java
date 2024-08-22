package chapter_9;
import java.util.Arrays;
public class Q10 {
  public static void main(String args[])
  {
    int a[][] = {{2,3,7}, {1,2,3}, {4,5,6}};
    int b[][] = {{4,5,6}, {2,3,7}, {1,2,3}};

    int c[][] = new int[3][3];

    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        int sum = 0;
        for (int k = 0; k < 3; k++)
        {
          sum += a[i][k] * b[k][j];
        }
        c[i][j] = sum;
      }
    }

    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 3; j++)
      {
       System.out.print(c[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
