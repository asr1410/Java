import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        int ticket = sc.hashCode();
        if (ticket >= 5 && ticket <= 40) {
            System.out.println("do you want refreshment");
            String refreshment = sc.next();
            System.out.println("do you have coupon");
            String code = sc.next();
            System.out.println("enter the circle");
            String circle = sc.next();
            double cost = 0;
            int value;
            switch (circle) {
            case "k":
                value = 75;
                cost = (ticket * value);
                if (ticket > 20) {
                    cost -= (0.10 * cost);
                }
                if (code.equals("y")) {
                    cost -= (0.02 * cost);
                }
                if (refreshment.equals("y")) {
                    cost += (50 * ticket);
                }
                System.out.println("ticket cost:" + String.format("%.2f", cost));
                break;
            case "q":
                value = 150;
                cost = (ticket * value);
                if (ticket > 20) {
                    cost -= (0.10 * cost);
                }
                if (code.equals("y")) {
                    cost -= (0.02 * cost);
                }
                if (refreshment.equals("y")) {
                    cost += (50 * ticket);
                }
                System.out.println("ticket cost:" + String.format("%.2f", cost));
                break;

            default:
                System.out.println("invalid input");
                break;
            }
        } else {
            System.out.println("minimum of 5 and maximum of 40 ticket");
        }
        sc.close();
    }
}
