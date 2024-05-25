import java.util.Scanner;

public class typeOfWebsiteSwitch {
    public static void main(String[] args) {

        // Find the type of website using switch case.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the website here: ");
        String web = sc.nextLine();
        String domain = web.substring(web.indexOf(".") + 1);

        switch (domain) {
            case "com":
                System.out.println("Commercial Website.");
                break;

            case "net":
                System.out.println("Network Website.");
                break;

            case "gov":
                System.out.println("Government Website.");
                break;

            case "org":
                System.out.println("Organization Website.");
                break;

            default:
                System.out.println("Invalid Website.");
                break;
        }
    }

}
