import java.util.Scanner;

public class Q9 {
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int maths;
    int chem;
    int phy;

    System.out.print("Enter marks in Mathematics : ");
    maths = in.nextInt();
    System.out.print("Enter marks in Chemistry : ");
    chem = in.nextInt();
    System.out.print("Enter marks in Physics : ");
    phy = in.nextInt();

    if (maths < 60)
    {
      System.out.println("Insufficient marks in mathematics");
      return;
    }
    else if (chem < 40)
    {
      System.out.println("Insufficient marks in chemistry");
      return;
    }
    else if (phy < 50)
    {
      System.out.println("Insufficient marks in physics");
      return;
    }

    else if ((chem + phy + maths) < 200)
    {
      System.out.println("Insufficient aggregate marks");
      return;
    }

    System.out.println("Eligible for admission");
  }
}
