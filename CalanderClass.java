import java.util.*;

public class CalanderClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime());
        System.out.println(c.getTimeZone());
    }
}
