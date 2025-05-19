public class swapping {
    public static void main(String[] args) {
        byte a = 4, b = 7;

        a = (byte) (a ^ b);
        b = (byte) (a ^ b);
        a = (byte) (a ^ b);

        System.out.println(a + " " + b);
    }

}
   
