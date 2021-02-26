public class OperatorPrecedence {
    public static void main(String[] args) {
        // precedence & associativity
        int a = 6 * 5 - 34 / 2;
        // hightest precedence goes to * and /
        // when there are two equal operator assciativity takes place here associativity
        // is left to right
        // =30-34/2
        // =30-17
        // =13
        int b = 60 / 5 - 34 * 2;
        // =12-34*2
        // =12-68
        // =-56
        System.out.println(a);
        System.out.println(b);
    }
}
