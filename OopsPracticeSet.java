/**
 * Employee
 */
class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

}

/**
 * CellPhone
 */
class CellPhone {

    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Mukul...");
    }
}

/**
 * Square
 */
class Square {

    int side;

    public void setSide(int a) {
        side = a;
    }

    public void area() {
        System.out.println("area of square is " + (side * side));
    }

    public void perimeter() {
        System.out.println("perimeter of square is " + (4 * side));
    }
}

/**
 * Tommy
 */
class Tommy {

    public void hit() {
        System.out.println("hitting the enemy");
    }

    public void run() {
        System.out.println("running from the enemy");
    }

    public void fire() {
        System.out.println("firing at the enemy");
    }
}

public class OopsPracticeSet {
    public static void main(String[] args) {
        // problem 1
        // Employee1 first = new Employee1();
        // first.setName("Abhishek Singh Rawat");
        // first.salary = 30000;
        // System.out.println(first.getName());
        // System.out.println(first.getSalary());

        // problem 2
        // CellPhone asus = new CellPhone();
        // asus.ring();
        // asus.vibrate();
        // asus.callFriend();

        // problem 3
        // Square abcd = new Square();
        // abcd.setSide(10);
        // abcd.area();
        // abcd.perimeter();

        // problem 4
        Tommy aman = new Tommy();
        aman.hit();
        aman.run();
        aman.fire();
    }
}
