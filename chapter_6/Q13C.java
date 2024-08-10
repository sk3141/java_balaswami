import java.util.Scanner;
public class Q13C {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int x;
    System.out.print("Enter value of X : ");
    x = s.nextInt();

    int y = (x >= 0) ? (x > 0 ? 1 : 0) : -1;
    System.out.println("Y = " + y);
  }
}
