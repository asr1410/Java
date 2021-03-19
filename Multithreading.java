class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("THREAD 1 --> IS RUNNING");
            System.out.println("THREAD 1 --> TASK IS CHATTING");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("THREAD 2 --> IS RUNNING");
            System.out.println("THREAD 2 --> TASK IS COOKING");
            i++;
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
