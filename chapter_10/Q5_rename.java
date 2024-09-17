package chapter_10;
interface Animal {
  void sound();
}

class Dog implements Animal {
  @Override
  public void sound() {
      System.out.println("Bark");
  }
}

public class Q5_rename {
  public static void main(String args[]) {
    Dog d = new Dog();
    d.sound();
  }
}