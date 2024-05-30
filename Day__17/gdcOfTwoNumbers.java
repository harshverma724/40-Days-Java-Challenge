import java.util.*;

public class gdcOfTwoNumbers {

    int gdc(int x, int y) {

        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }

        return x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number 1 here: ");
        int a = sc.nextInt();
        System.out.print("ENter number 2 here: ");
        int b = sc.nextInt();

        gdcOfTwoNumbers n = new gdcOfTwoNumbers();
        System.out.println("GDC is: " + n.gdc(a, b));

    }

}
