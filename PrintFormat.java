import java.util.Date;

/**
 * PrintFormat
 */
public class PrintFormat {

    public static void main(String[] args) {
        int number = 7;
        System.out.printf("length of String %s is %d %n", "abcd", "abcd".length());
        System.out.printf("%3$2s, %2$2s, %1$2s %n", "Tokyo", "London", "NewYork");
        System.out.printf("Date in MM/dd/yy format is %tD %n", new Date());
        System.out.printf("Value of PIE is %f %n", Math.PI);
        System.out.printf("Value of PIE up to 2 decimal place is %.2f %n", Math.PI);
        System.out.printf("Value of PIE up-to 3 decimals is %.3f", Math.PI);
        String str = String.format("%03d", number);
        System.out.printf("original number %d, numeric string with padding : %s%n", 7, str);
        // format
        System.out.println("THIS IS PRINT USING FORMAT METHOD IN JAVA");
        System.out.format("length of String %s is %d %n", "abcd", "abcd".length());
        System.out.format("%3$2s, %2$2s, %1$2s %n", "Tokyo", "London", "NewYork");
        System.out.format("Date in MM/dd/yy format is %tD %n", new Date());
        System.out.format("Value of PIE is %f %n", Math.PI);
        System.out.format("Value of PIE up to 2 decimal place is %.2f %n", Math.PI);
        System.out.format("Value of PIE up-to 3 decimals is %.3f", Math.PI);
        String str1 = String.format("%03d", number);
        System.out.format("original number %d, numeric string with padding : %s", 7, str1);
    }
}