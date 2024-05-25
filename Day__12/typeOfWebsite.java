import java.util.Scanner;

public class typeOfWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Website here: ");
        String web = sc.nextLine();

        // For protocol

        if (web.startsWith("http")) {
            System.out.println("Hyper text transfer Protocol.");
        } else if (web.startsWith("https")) {
            System.out.println("Hyper text transfer Protocol Secure.");
        } else if (web.startsWith("ftp")) {
            System.out.println("File Transfer Protocol.");
        } else {
            System.out.println("Invalid Protocol.");
        }

        // For website

        if (web.endsWith(".com")) {
            System.out.println("Commercial Website.");
        } else if (web.endsWith(".gov")) {
            System.out.println("Government Website.");
        } else if (web.endsWith(".org")) {
            System.out.println("Organization Website.");
        } else if (web.endsWith(".net")) {
            System.out.println("Network Website.");
        }
    }
}
