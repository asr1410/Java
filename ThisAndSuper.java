/**
 * ThisAndSuper
 */
class EkClass {
    private int a;

    EkClass(int v) {
        setA(v);
        System.out.println("this is the constructor of ek class");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int returnone() {
        return 1;
    }
}

class DoClass extends EkClass {
    private int b;

    public DoClass(int b, int c) {
        super(c);
        System.out.println("this is the constructor of do class");
        this.setB(b);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}

public class ThisAndSuper {

    public static void main(String[] args) {
        // EkClass e = new EkClass(5);
        // System.out.println(e.getA());
        DoClass d = new DoClass(10, 20);
        System.out.println(d.getA());
    }
}