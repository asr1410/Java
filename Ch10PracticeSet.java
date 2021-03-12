/**
 * Ch10PracticeSet
 */
class Circle {
    public int radius;

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}

class Cylinder1 extends Circle {
    public int height;

    public double volume() {
        return Math.PI * this.radius * this.height * this.radius;
    }

    public Cylinder1(int radius, int height) {
        super(radius);
        this.height = height;
    }
}

public class Ch10PracticeSet {

    public static void main(String[] args) {
        Cylinder1 abc = new Cylinder1(7, 7);
        System.out.println(abc.volume());
        System.out.println(abc.area());
    }
}