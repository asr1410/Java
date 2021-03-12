class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on phone");
    }

    public void off() {
        System.out.println("Turning off phone");
    }
}

class SmartsPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on smartphone");
    }

    public void off() {
        System.out.println("Turning off smartphone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // SmartPhone smobj = new SmartPhone();
        // obj.greet();
        Phone obj = new SmartsPhone();// allowed
        // SmartPhone obj2 = new Phone(); // not allowed
        obj.showTime();
        obj.on();
        obj.off();
    }
}
