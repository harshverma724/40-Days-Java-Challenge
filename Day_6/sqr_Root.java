import java.util.*;
import java.math.*;

public class sqr_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        String str1 = " ", str2 = " ";
        System.out.println("Enter the value of a ,b ,c here: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        r2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        if (r1 >= 0 && r2 >= 0) {
            str1 = "+" + r1 + "";
            str2 = "+" + r2 + "";
            System.out.println("Roots are: " + str1 + " and " + str2);
        } else {
            System.out.println("Roots are: " + r1 + " and " + r2);
        }

    }

}
