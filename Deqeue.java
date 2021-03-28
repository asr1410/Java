import java.util.ArrayDeque;

public class Deqeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(4);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
    }
}
