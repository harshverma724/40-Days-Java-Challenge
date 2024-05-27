import java.util.Scanner;

public class newfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the no. here: ");
        int num = sc.nextInt();
        String str = "";
        int i = 0;
        while (num > 0) {
            i = num % 10;
            str = str + i;
            num = num / 10;

        }

        for (int j = str.length() - 1; j >= 0; j--) {
            char a = str.charAt(j);

            switch (a) {
                case '1':
                    System.out.print("One ");
                    break;

                case '2':
                    System.out.print("Two ");
                    break;

                case '3':
                    System.out.print("Three ");
                    break;

                case '4':
                    System.out.print("Four ");
                    break;

                case '5':
                    System.out.print("Five ");
                    break;

                case '6':
                    System.out.print("Six ");
                    break;

                case '7':
                    System.out.print("Seven ");
                    break;

                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                case '0':
                    System.out.print("Zero ");
                    break;
            }

        }

    }
}
