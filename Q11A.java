public class Q11A {
  public static void main(String[] args) {
    int number = 1; 
    int limit = 91; 

    for (int i = 1; number <= limit; i++) { 
      for (int j = 1; j <= i; j++) { 
          if (number > limit) {
            break; 
         }
          System.out.print(number + " ");
          number++; 
      }
      System.out.println();
    }
  }
}