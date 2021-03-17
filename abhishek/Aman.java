package abhishek;

import amandeep.Modifier;

class Using extends Modifier {
    public void meth() {
        // System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
    }
}

public class Aman {
    public static void main(String[] args) {
        Modifier g = new Modifier();
        // System.out.println(g.w);
        System.out.println(g.x);
        // System.out.println(g.y);
        // System.out.println(g.z);
        Using c = new Using();
        c.meth();
    }
}
