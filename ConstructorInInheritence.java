class Base1 {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Base1() {
        System.out.println("mai ek constructor hu");
    }

    public Base1(int x) {
        System.out.println("i am the base class constructor with value " + x);
    }
}

class Derived1 extends Base1 {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Derived1() {
        super(0);
        System.out.println("i am a derived class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("i am a derived class constructor with value " + y);
    }

}

public class ConstructorInInheritence {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        Derived1 d = new Derived1(12, 12);
        // b.setX(10);
        d.setX(10);
    }
}
