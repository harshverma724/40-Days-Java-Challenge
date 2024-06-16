
import java.util.*;

public class tokenizerDemo {
    public static void main(String[] args) {

        String data = "Name=Harsh Dept=CSE,Country=India,univ=Poornima";

        StringTokenizer s = new StringTokenizer(data, "=, ");

        String s1;

        while (s.hasMoreTokens()) {
            s1 = s.nextToken();
            System.out.println(s1);
        }

    }

}
