package chapter_7;
public class Q9 {

  public static void main(String[] args) {
      int[] principalValues = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
      double[] interestRates = {0.10, 0.11, 0.12, 0.13, 0.14, 0.15, 0.16, 0.17, 0.18, 0.19, 0.20};
      int[] years = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      for (int P : principalValues) {
          System.out.println("Principal: " + P);
          for (double r : interestRates) {
              System.out.println("Interest Rate: " + (r * 100) + "%");
              System.out.println("Year\tValue of Investment");
              for (int n : years) {
                  double V = P * Math.pow(1 + r, n);
                  System.out.printf("%d\t%.2f%n", n, V);
              }
              System.out.println();
          }
          System.out.println("--------------------------------------------");
      }
  }
}
