package chapter_10;
interface Movable {
  void move();
}

interface Swimmable extends Movable {
  void swim();
}

class Dolphin implements Swimmable {
  @Override
  public void move() {
      System.out.println("Dolphin is moving");
  }

  @Override
  public void swim() {
      System.out.println("Dolphin is swimming");
  }
}

public class Q5_inheritance {
  public static void main(String args[]) {
    Dolphin d = new Dolphin();
    d.move();
    d.swim();
  }
}