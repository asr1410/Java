import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        int i = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nuber to find the table --> ");
        num = sc.nextInt();
        System.out.println("this is while loop");
        while (i < 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
        System.out.println("this is do while loop");
        do {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        } while (i < 20);
        System.out.println("this is for loop");
        for (int j = i; j < 30; j++) {
            System.out.println(num + " X " + j + " = " + (num * j));
        }
        System.out.println("all loop executed");
        sc.close();
    }
}