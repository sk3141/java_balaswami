package chapter_10;

public class Q5_default {
  public static void main(String args[]) {
    Dog d = new Dog();
    d.sound();
    d.sleep();
  }
}
interface Animal {
  void sound();

  default void sleep() {
      System.out.println("Sleeping");
  }
}

class Dog implements Animal {
  @Override
  public void sound() {
      System.out.println("Bark");
  }
}

class Cat implements Animal {
  @Override
  public void sound() {
      System.out.println("Meow");
  }

  @Override
  public void sleep() {
      System.out.println("Cat is sleeping");
  }
}
