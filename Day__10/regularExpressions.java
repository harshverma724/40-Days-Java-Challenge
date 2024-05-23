public class regularExpressions {
    public static void main(String[] args) {

        // " . " matches if any single character or digit is present.

        String s1 = "A";
        String s2 = "4";
        System.out.println(s1.matches("."));
        System.out.println(s2.matches("."));

        // [abc]: whether a ,b ,c (or nay character) is present or not.

        String s3 = "x";
        System.out.println(s3.matches("[xds]"));

        // [^abc]: take anything except abc

        String s5 = "t";
        System.out.println(s5.matches("[^xds]"));

        // [a-z0-9]: Allow from a to z and 0 to 9.

        String s4 = "r";
        System.out.println(s4.matches("[a-t0-9]"));
        System.out.println(s4.matches("[a-tA-Z0-9]"));

        // [a-z][0-9]:anything between them is present or not.

        String s6 = "f4";
        System.out.println(s6.matches("[a-z][0-9]"));

        // a|b:whether a or b is present or not.

        String s7 = "a";
        System.out.println(s7.matches("a|b"));

    }

}
