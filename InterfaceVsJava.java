interface Bicycle {
    final int a = 45;

    void getValue();

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface BlowHorn {

    void blowHornk3g();

    void blowHornmhn();
}

class AvonCycle implements Bicycle, BlowHorn {
    void BlowHorn() {
        System.out.println("pee pee poo poo");
    }

    public void applyBrake(int decrement) {
        System.out.println("apply brakes");
    }

    public void speedUp(int increment) {
        System.out.println("apply speedup");
    }

    public void getValue() {
        System.out.println(AvonCycle.a);
    }

    public void blowHornk3g() {
        System.out.println("kabhi khushi kabhi gum");
    }

    public void blowHornmhn() {
        System.out.println("main hoo na");
    }
}

public class InterfaceVsJava {
    public static void main(String[] args) {
        AvonCycle cycleAman = new AvonCycle();
        cycleAman.applyBrake(1);
        cycleAman.getValue();
        // you cannot modify the properties in the interface
        // cycleAman.a = 45;
    }
}
