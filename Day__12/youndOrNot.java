import java.util.*;

public class youndOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age here: ");
        int age = sc.nextInt();
        if (age >= 14 && age <= 55) {
            System.out.println("Congratulations you are young.");
        } else if (age < 14) {
            System.out.println("You are a kid.");
        } else {
            System.out.println("You are old now.");
        }

    }

}
