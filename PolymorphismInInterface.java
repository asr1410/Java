interface MyCamera1 {
    void takeSnap();

    void videoRecording();

    private void greet() {
        System.out.println("good morning");
    }

    // default method not necessary to recall int the class
    default void videoRecording4k() {
        greet();
        System.out.println("recording started in 4k");
    }
}

interface MyWifi1 {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone1 {
    void callToNumber(int number) {
        System.out.println("calling to " + number);
    }

    void callPickUp() {
        System.out.println("call connecting...");
    }
}

class MySmartPhone1 extends MyCellPhone1 implements MyWifi1, MyCamera1 {
    public void takeSnap() {
        System.out.println("snap clicked");
    }

    public void videoRecording() {
        System.out.println("video recording started");
    }

    // public void videoRecording4k() {
    // System.out.println("video recording started in 4k");
    // }

    public String[] getNetwork() {
        System.out.println("getting list of network");
        String[] networkList = { "airtel", "idea", "jio", "vodaphone" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("connected to " + network);
    }

    public void sampleMeth() {
        System.out.println("sampleMeth");
    }
}

public class PolymorphismInInterface {
    public static void main(String[] args) {
        MyCamera1 cam1 = new MySmartPhone1();// this is a smart phone but use it as a camera
        // cam1.getNetwork();
        // cam1.sampleMeth();
        cam1.takeSnap();
        cam1.videoRecording4k();
        MySmartPhone1 s = new MySmartPhone1();
        s.callPickUp();
        s.sampleMeth();
        s.callToNumber(9950);
    }
}
