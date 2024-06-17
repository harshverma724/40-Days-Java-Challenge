import java.util.*;

public class datetimeDemo {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365 + " Years since 1st January 1970");

        Date d = new Date();
        System.out.println(d + " is current date and time.");
        System.out.println("Current Date: " + d.getDate());
        System.out.println(d.getDay() + "th day of the week.");
        System.out.println(d.getMonth() + "th Month.");
    }

}
