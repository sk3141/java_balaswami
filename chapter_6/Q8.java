public class Q8 {
  public static void main(String args[])
  {
    int[] marks = {43, 65,76,12,89,21,100,54};
    int[] counts = new int[4];

    for (int i : marks)
    {
      if (i >= 81 && i <= 100)
        counts[0]++;    
      else if (i >= 61 && i <= 80)
        counts[1]++;
      else if (i >= 41 && i <= 60)
        counts[2]++;
      else if (i >= 0 && i <= 40)
        counts[3]++;
      else
        System.out.println("Invalid marks input");
    }

    System.out.println("81 - 100 : " + counts[0]);
    System.out.println("61 - 80 : " + counts[1]);
    System.out.println("41 - 60 : " + counts[2]);
    System.out.println("0 - 40 : " + counts[3]);
  }
}
