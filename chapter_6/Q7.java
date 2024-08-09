import java.util.Scanner;

public class Q7 {
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Coefficents for equations : \nax1 + bx2 = m \ncx1 + dx2 =n");
    System.out.print("a = ");
    int a = in.nextInt();
    System.out.print("b = ");
    int b = in.nextInt();
    System.out.print("c = ");
    int c = in.nextInt();
    System.out.print("d = ");
    int d = in.nextInt();
    System.out.print("m = ");
    int m = in.nextInt();
    System.out.print("n = ");
    int n = in.nextInt();

    if (((a * d) - (c * b)) == 0)
      System.out.println("Invalid Inputs");
    int x1 = ((m * d) - (b * n)) / ((a * d) - (c * b));
    int x2 = ((n * a) - (m * c)) / ((a * d) - (c * b));

    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
  }  
}
