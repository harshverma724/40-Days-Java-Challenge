public class methodPracticeTwo {

    static int change(int x, int value) {
        x = value;
        return x;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = change(a, 24);
        System.out.println("Actual Parameters: " + a);
        System.out.println("Formal Parameters : " + b);

    }

}
