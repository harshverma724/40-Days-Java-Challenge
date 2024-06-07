public class finallyOne {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Program Executed.");
        }

    }

}
