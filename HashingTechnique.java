import java.util.HashSet;

//HASHING IS THE TECHNIQUE IN WHICH ARRAY SIZE IS ADD INTO AT THE INDICES
public class HashingTechnique {
    public static void main(String[] args) {
        HashSet<Integer> l1 = new HashSet<>(6, 0.5f);
        l1.add(5);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        System.out.println(l1);
    }
}
