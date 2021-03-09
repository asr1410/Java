import java.util.Scanner;

public class MultiDimensinalArray {
    public static void main(String[] args) {
        int flats[][] = new int[4][4];
        Scanner insert = new Scanner(System.in);
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print("insert the family member in flat no " + (j + 1) + " of " + (i + 1) + "st floor -->");
                flats[i][j] = insert.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("no of people in " + (i + 1) + " floor no " + (j + 1) + " are " + flats[i][j]);
            }
        }
        insert.close();
    }
}
