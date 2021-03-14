/**
 * interfaces
 */
interface Cycle {
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrake(int decrement);
}

class Atlas implements Cycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
}

public class interfaces {

    public static void main(String[] args) {
        Atlas a = new Atlas();
        a.changeCadence(20);
        a.speedUp(20);
        a.applyBrake(20);
        a.changeGear(5);
        System.out.println(a.gear);
        System.out.println(a.speed);
        System.out.println(a.cadence);
    }
}