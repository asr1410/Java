/**
 * Inheritence
 */
class Base3 {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Base3() {
        System.out.println("this is a base class constructor");
    }
}

class Derived3 extends Base3 {
    private int y;

    public Derived3() {
        System.out.println("this is a constructor of the derived class");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritence {

    public static void main(String[] args) {
        Derived3 d = new Derived3();
    }
}