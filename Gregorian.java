import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2019));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
    }
}
