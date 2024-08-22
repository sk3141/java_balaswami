package chapter_9;

public class Q11 {
  public static String delete(String str, int m)
  {
    if (m > 0 && m <= str.length())
    {
      return str.substring(0, m - 1) + str.substring(m);
    }
    else {
      System.out.println("Invalid index");
      return str;
    }
  }
  public static void main(String args[])
  {
    String str = "hello";
    System.out.print(delete(str, 2));
  }
}
