class MyNewThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("thank you thread1");
        }
    }
}

class MyNewThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("thank you thread2");
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
