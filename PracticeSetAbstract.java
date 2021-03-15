abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }

    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("changing the nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jumping..");
    }

    void bite() {
        System.out.println("Biting..");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello Sir");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}

public class PracticeSetAbstract {
    public static void main(String[] args) {

        // ques 1 and ques 2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // ques 3
        Human aman = new Human();
        aman.sleep();

        // ques 5
        Monkey m1 = new Human();
        // Monkey.speak();//cannot used the method the referece is of monkey
        m1.jump();

        BasicAnimal lovish = new Human();
        // lovish.speak();
        lovish.eat();
        lovish.sleep();
    }
}
