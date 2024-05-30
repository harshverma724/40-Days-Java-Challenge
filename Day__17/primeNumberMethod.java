import java.util.*;

public class primeNumberMethod {

    static boolean prime(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int a = sc.nextInt();

        System.out.println(prime(a));

    }

}
