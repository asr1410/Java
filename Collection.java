import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l2.add(5);
        l2.add(5);
        l2.add(5);
        l2.add(5);
        l2.add(5);
        l1.addAll(0, l2);
        // l1.clear();
        System.out.println(l1.contains(4));
        System.out.println(l1.indexOf(6));
        // for (Integer integer : l1) {
        // System.out.println(integer);
        // }
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
