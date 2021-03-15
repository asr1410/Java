interface MyCamera {
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

interface MyWifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callToNumber(int number) {
        System.out.println("calling to " + number);
    }

    void callPickUp() {
        System.out.println("call connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
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
}

public class DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.videoRecording4k();
        // ms.greet();//it is a private function
        String[] nl = ms.getNetwork();
        for (String item : nl) {
            System.out.println(item);
        }
    }
}
