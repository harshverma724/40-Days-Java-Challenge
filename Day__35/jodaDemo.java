import java.util.*;
import java.time.*;

public class jodaDemo {
    public static void main(String[] args) {
        /*
         * Date d = new Date();
         * System.out.println(d);
         */
        LocalDate d1 = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(d1);

        LocalTime l = LocalTime.now();
        System.out.println(l);
    }

}
