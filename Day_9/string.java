public class string {
    public static void main(String[] args) {

        String str1 = "Harsh Verma";
        System.out.println(str1);

        String str2 = new String("Harsh Verma");
        System.out.println(str2);

        char c[] = { 'a', 'b', 'c', 'd' };
        String str0 = new String(c, 2, 2);
        System.out.println(str0);

        byte b[] = { 66, 67, 68, 69 };
        String str3 = new String(b, 2, 2);
        String str4 = new String(b, 1, 2);
        System.out.println(str3);
        System.out.println(str4);

    }

}
