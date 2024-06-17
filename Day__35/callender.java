import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class callender {
    public static void main(String[] args) {

        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2024));

        System.out.println(g.get(Calendar.DATE));
        System.out.println(g.get(Calendar.DAY_OF_WEEK));

        TimeZone t = g.getTimeZone();
        System.out.println(t);

    }

}
