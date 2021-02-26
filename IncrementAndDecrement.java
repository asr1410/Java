public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a = 5 + 6;
        System.out.println(a);
        System.out.println(++a);// first increment than print
        System.out.println(a);
        System.out.println(a++);// first print than increment
        System.out.println(a);
        int b = 7 + a++;
        System.out.println(b);
        System.out.println(a);

    }
}
