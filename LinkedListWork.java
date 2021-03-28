import java.util.LinkedList;

public class LinkedListWork {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l2.add(6);
        l2.add(6);
        l2.add(6);
        l2.add(6);
        l2.add(6);
        l1.addAll(l2);
        l1.addLast(7);
        for (Integer integer : l1) {
            System.out.println(integer);
        }
    }
}
