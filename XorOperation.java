public class XorOperation {
    public int xorOperation(int n, int start) {
        if (n == 0) {
            return 0;
        }
        return start ^ xorOperation(--n, start + 2);
    }

    public static void main(String[] args) {
        XorOperation s = new XorOperation();
        System.out.println(s.xorOperation(5, 0));
    }
}
