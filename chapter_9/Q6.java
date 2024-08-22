package chapter_9;
import java.lang.Math;
public class Q6 {
  public static float getRandomVal(float min, float max)
  {
    return min + (max - min) * (float)Math.random();
  }

  public static float[] highest(float[][] arr)
  {
    float max = 0;
    float result[] = new float[2];
    for (int i = 0; i < 31; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        if (arr[i][j] > max){
          max = arr[i][j];
          result[0] = max;
          result[1] = j;
        }
      }
    }
    return result;
    
  }

  public static float[] lowest(float[][] arr)
  {
    float min = 0;
    float result[] = new float[2];
    for (int i = 0; i < 31; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        if (arr[i][j] < min){
          min = arr[i][j];
          result[0] = min;
          result[1] = j;
        }
      }
    }
    return result;
    
  }
  public static void main(String args[])
  {
    String cities[] = {"Tokyo", "Paris", "New York", "Cairo", "Sydney", "Rio de Janeiro", "Moscow", "Cape Town", "Bangkok", "Toronto"};
    float tempData[][] = new float[31][10];
    float res[] = new float[2];

    for (int i = 0; i  < 31; i++)
    {
      float min = getRandomVal(0.0f, 20.0f);
      float max = getRandomVal(20.0f, 45.0f);
      for (int j = 0; j < 10; j++)
      {
        tempData[i][j] = getRandomVal(min, max);
      }
    }
    System.out.printf("The Day with highest temp was %3.1f in %s \n", 
      highest(tempData)[0], cities[(int)highest(tempData)[1]]);

    System.out.printf("The Day with lowest temp was %3.1f in %s \n", 
      lowest(tempData)[0], cities[(int)lowest(tempData)[1]]);

  }
}
