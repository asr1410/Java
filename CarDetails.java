import java.util.Scanner;

public class CarDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String carName;
        int carNo;
        double carPrice;
        System.out.println("Enter the car name:");
        carName = sc.next();
        System.out.println("Enter the car no:");
        carNo = sc.nextInt();
        System.out.println("Enter the price:");
        carPrice = sc.nextDouble();
        System.out.println("Carname:" + carName);
        System.out.println("Carno:" + carNo);
        System.out.printf("Price:%.2f rs only", carPrice);
        sc.close();
    }
}
