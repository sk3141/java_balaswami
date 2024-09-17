package chapter_10;

interface Animal {
    void sound();
}

interface Movable {
    void move();
}

class Dog implements Animal, Movable {
    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}

public class Q5_multiple {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.sound();
        d.move();
    }
}