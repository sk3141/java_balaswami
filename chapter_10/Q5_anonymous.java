package chapter_10;

interface Animal {
  void sound();
}

public class Q5_anonymous {
  public static void main(String[] args) {
      Animal dog = new Animal() {
          @Override
          public void sound() {
              System.out.println("Bark");
          }
      };
      dog.sound();
  }
}
