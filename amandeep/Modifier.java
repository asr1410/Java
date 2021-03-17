package amandeep;

class C1 {
    int w = 4;
    public int x = 5;
    protected int y = 6;
    private int z = 7;

    public void meth1() {
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

public class Modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
        System.out.println(c.w);
        System.out.println(c.x);
        System.out.println(c.y);
        // System.out.println(c.z);//throw error as it is a private variable
    }
}
