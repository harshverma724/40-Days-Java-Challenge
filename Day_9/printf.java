public class printf {
    public static void main(String[] args) {

        int a = 10;
        int b = -10;

        // width: Spaces before actual output
        System.out.printf("%5d\n", a);

        // flags: replace those blank spaces with 0s.

        System.out.printf("%05d\n", a);

        // bracket(

        System.out.printf("%(5d\n", b);

        // for positive and negative

        System.out.printf("%+5d\n", a);
        System.out.printf("%+5d\n", b);

    }

}
