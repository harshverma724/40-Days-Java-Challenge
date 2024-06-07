import java.util.Scanner;

public class throwThrows {
    public int meth1(int x, int y) throws Exception {
        if (x < 0 || y < 0)
            throw new Exception("Error");

        return (x / y);
    }

    public throwThrows(int a, int b) {
        try {
            int x = meth1(a, b);
            System.out.println("Division is: " + x);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter no. 1 here: ");
        int a = sc.nextInt();
        System.out.println("ENter no. 2 here: ");
        int b = sc.nextInt();

        throwThrows t = new throwThrows(a, b);

    }

}
