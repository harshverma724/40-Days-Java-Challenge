public class metaExpressions {
    public static void main(String[] args) {

        // d: a digit

        String s1 = "3";
        String s2 = "d";
        System.out.println(s1.matches("\\d"));
        System.out.println(s2.matches("\\d"));

        // D: not a digit

        String s3 = "A";
        System.out.println(s3.matches("\\D"));
        String s4 = "5";
        System.out.println(s4.matches("\\D"));

        // s: space {only count 1 space , flase if more that 1 space is present}

        String s5 = " ";
        System.out.println(s5.matches("\\s"));

        // S: not space

        String s7 = "A";
        System.out.println(s7.matches("\\S"));
        String s8 = " ";
        System.out.println(s8.matches("\\S"));

        // w: alphabet or digits

        String s9 = "A";
        System.out.println(s9.matches("\\w"));
        String s10 = "5";
        System.out.println(s10.matches("\\w"));

        // W: not alphabets nor digits

        String s11 = "@";
        System.out.println(s11.matches("\\W"));
        String s12 = "-";
        System.out.println(s12.matches("\\W"));

    }

}
