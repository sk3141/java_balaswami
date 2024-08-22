package chapter_9;
public class Q7 {
  public static float getRandomVal(float min, float max)
  {
    return min + (max - min) * (float)Math.random();
  }
  public static void main(String args[])
  {
    int count[] = new int[6];
    int ballots[] = new int[50];

    for (int i = 0; i < 50; i++)
      ballots[i] = (int)getRandomVal(0.0f, 8.0f);

    for (int i = 0; i < 50; i++)
    {
      if (ballots[i] >= 6){
        count[5]++;
        continue;
      }
      count[ballots[i]]++;
    }

    for (int i = 0; i < 5; i++)
      System.out.println("Candidate " + i + " Scored " + count[i] + " votes");
    System.out.println("No of spilt votes : " + count[5]);
  }
}
