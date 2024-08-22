package chapter_9;

public class Q8 {
  public static int[][] getRandomVal(int min, int max)
  {
    int [][] temp = new int[100][3];
    for (int i = 0; i < 100; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        temp[i][j] = min + (int)(Math.random() * (max - min));
      }
    }
    
    return temp;
  }

  public static void main(String args[])
  {
    int data[][] = getRandomVal(0, 100);
    for (int i = 0; i < 100; i++)
    {
      int sum = 0;
      for (int j = 0; j < 3; j++) {
        sum += data[i][j];
      }

      System.out.println("Total marks of roll no " + (i + 1) + " : " + sum);
    }
  }
}
