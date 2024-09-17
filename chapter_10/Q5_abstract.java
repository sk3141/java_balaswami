package chapter_10;

public class Q5_abstract {
  public static void main(String args[]) {
    Dog d = new Dog();
    d.sound();
  }
}
interface Animal {
  void sound();
  void sleep();
}

abstract class Mammal implements Animal {
  @Override
  public void sleep() {
      System.out.println("Sleeping");
  }
}

class Dog extends Mammal {
  @Override
  public void sound() {
      System.out.println("Bark");
  }
}
