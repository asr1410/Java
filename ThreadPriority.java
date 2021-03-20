
class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 34) {
            System.out.println("thank you " + this.getName());
            i++;
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        // Ready queue
        Mythr1 t1 = new Mythr1("harry1");
        Mythr1 t2 = new Mythr1("harry2");
        Mythr1 t3 = new Mythr1("harry3");
        Mythr1 t4 = new Mythr1("harry4");
        Mythr1 t5 = new Mythr1("harry5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
