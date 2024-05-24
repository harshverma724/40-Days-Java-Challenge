import java.util.*;

public class studentChallenge1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Check whether a String Contains a gmail acccount or not.
        // Find username and domail name.

        System.out.print("Enter your mail address: ");
        String s1 = sc.nextLine();
        System.out.println(s1.matches(".*gmail.*"));
        int index1 = (s1.indexOf("@"));
        System.out.print("Username: ");
        System.out.println(s1.substring(0, index1));
        System.out.print("Domain: ");
        System.out.println(s1.substring((index1 + 1), s1.length()));
        int index = s1.indexOf(".");
        String account = (s1.substring((index1 + 1), (index)));
        String gmail = "gmail";
        if (account.equals(gmail)) {
            System.out.println("Yes it is a gmail account.");
        } else {
            System.out.println("No, It is a " + account + " Account.");
        }

        System.out.println();
        System.out.println("After Concatination.");
        System.out.println();
        // After Concatination

        // Check whether a String Contains a gmail acccount or not.
        // Find username and domail name.
        System.out.print("Enter your mail address: ");
        String s2 = sc.nextLine();
        System.out.println(s2.matches(".*gmail.*"));
        System.out.println("Username: " + s2.substring(0, (s2.indexOf("@"))));
        System.out.println("Domain: " + s2.substring(((s2.indexOf("@")) + 1), s2.length()));
        String account1 = (s2.substring(((s2.indexOf("@")) + 1), s2.indexOf(".")));
        if (account1.equals("gmail")) {
            System.out.println("Yes it is a gmail account.");
        } else {
            System.out.println("No, It is a " + account1 + " Account.");
        }
    }

}
