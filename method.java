/**
 * method
 */
public class method {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        // USING METHOD INVOCATION
        // method obj = new method();
        // int c = obj.logic(a, b);
        int c = logic(a, b);
        System.out.println(c);
    }
}
