import java.util.Scanner;

public class airthmeticProgressionSeries {
    public static void main(String[] args) {

        // Pring Airthmetic Progression Series of a number to n no. of terms.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int num = sc.nextInt();
        System.out.print("Enter the common difference here: ");
        int diff = sc.nextInt();
        System.out.print("Till how many terms you want this series: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(num);
            if (i < n) {
                System.out.print(",");
            }
            num = num + diff;

        }

    }
}