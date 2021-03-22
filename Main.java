import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float charges = 0;
        System.out.println("Enter consumer number");
        // int custNo = sc.nextInt();
        System.out.println("Enter consumption");
        int cuns = sc.nextInt();
        if (cuns < 0 || cuns > 500) {
            System.out.println("Invalid");
            System.exit(1);
        } else if (cuns >= 0 && cuns <= 100) {
            charges = 0 + 20;
        } else if (cuns >= 101 && cuns <= 200) {
            cuns = cuns - 100;
            charges = (cuns * 1.5f) + 20;
        } else if (cuns >= 201 && cuns <= 300) {
            cuns = cuns - 100;
            charges = (cuns * 2f) + 20;
        } else if (cuns >= 301 && cuns <= 500) {
            cuns = cuns - 100;
            charges = (cuns * 3f) + 30;
        }
        System.out.printf("Total Charges Rs. %.2f", charges);
        sc.close();
    }
}
