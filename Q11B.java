public class Q11B {
  public static void main(String[] args) {
      int number = 1; 
      int limit = 91; 
      int toggle = 0; 

      for (int i = 1; number <= limit; i++) { 
          for (int j = 1; j <= i; j++) { 
              if (number > limit) {
                  break; // 
              }
              System.out.print(toggle + " ");
              toggle = 1 - toggle; 
              number++; 
          }
          System.out.println();
      }
  }
}