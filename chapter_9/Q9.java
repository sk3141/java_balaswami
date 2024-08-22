package chapter_9;
import java.util.Arrays;
public class Q9 {
  public static int[] merge(int arr1[], int arr2[])
  {
    int n1 = arr1.length;
    int n2 = arr2.length;
    int arr3[] = new int[n1 + n2];

    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2)
    {
      if (arr1[i] <= arr2[j])
      {
        arr3[k++] = arr1[i++];
      }
      else
      {
        arr3[k++] = arr2[j++];
      }
    }

    while (i < n1)
    {
      arr3[k++] = arr1[i++];
    }
    while (j < n2)
    {
      arr3[k++] = arr2[j++];
    }
    return arr3;
  }
  public static void main(String args[])
  {
    int a[] = {4,5,6,7,8,10,11};
    int b[] = {3,6,9,12,15};

    int c[] = merge(a, b);
    for (int i = 0; i < c.length; i++)
    {
      System.out.print(c[i] + "\t");
    }
  }
}
