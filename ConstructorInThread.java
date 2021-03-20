class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("thank you");
        // while (i < 400) {
        // System.out.println("i am a thread");
        // i++;
        // }
    }
}

public class ConstructorInThread {
    public static void main(String[] args) {
        MyThr t = new MyThr("Harry");
        t.start();
        System.out.println("the id of the thread t is " + t.getId());
        System.out.println("the name of the thread t is " + t.getName());
    }
}
