public class BreakandContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Break the loop");
                continue;
                // break;
            }
            System.out.println(i);
            System.out.println("java is great");
            System.out.println("This to ");
        }
    }
}
