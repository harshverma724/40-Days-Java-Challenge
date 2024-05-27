import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        // Find fibonacci series of a number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of terms here: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int series;
        System.out.print(a + " , " + b + " , ");

        for (int i = 1; i <= num; i++) {
            series = a + b;
            System.out.print(series + " , ");

            a = b;
            b = series;
            // series = a + b;

        }

    }

}
