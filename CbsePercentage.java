import java.util.Scanner;

/**
 * CbsePercentage
 */
public class CbsePercentage {

    public static void main(String[] args) {
        System.out.println("Enter the number of subjects :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0, marks;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of subject " + (i + 1) + " :- ");
            marks = sc.nextFloat();
            sum += marks;
        }
        float percent = (sum / (n * 100)) * 100;
        System.out.print("Percentage is " + percent + " %");
        sc.close();
    }
}