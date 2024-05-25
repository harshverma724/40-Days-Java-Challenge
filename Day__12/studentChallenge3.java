import java.util.*;

public class studentChallenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Remove Special Characters from a String.
        System.out.print("Enter the String here: ");
        String s1 = sc.nextLine();
        System.out.println("New String: " + s1.replaceAll("[^a-zA-Z0-9]+", ""));

        // Remove Extra Spaces from a String.

        System.out.print("Enter the String here: ");
        String s2 = sc.nextLine();
        System.out.println("New String: " + s2.replaceAll("\\s+", ""));

        // Find number of words ina String.

        System.out.print("Enter the String here: ");
        String s3 = sc.nextLine();
        s3 = s3.replaceAll("\\s+", " ").trim();
        String words[] = s3.split("\\s");
        System.out.println(words.length);

    }

}
