import java.util.Scanner;

public class geometricProgression {
    public static void main(String[] args) {

        // Find Geometric Progression

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int num = sc.nextInt();
        System.out.print("Enter the common ratio here: ");
        int diff = sc.nextInt();
        System.out.print("Till how many terms you want this series: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(num);
            if (i < n) {
                System.out.print(",");
            }
            num = num * diff;

        }
    }

}
