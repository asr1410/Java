/**
 * ThreadPractice
 */
class MythreadPractice1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("good morning");
        }
    }
}

class MythreadPractice2 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("good afternoon");
        }
    }
}

public class ThreadPractice {

    public static void main(String[] args) {
        MythreadPractice1 t1 = new MythreadPractice1();
        MythreadPractice2 t2 = new MythreadPractice2();
        t1.start();
        t2.start();
    }
}