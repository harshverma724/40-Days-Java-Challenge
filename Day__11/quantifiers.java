public class quantifiers {
    public static void main(String[] args) {

        // *: nothing(0) or more. for no limits
        String s1 = "wsddefs";
        System.out.println(s1.matches("."));
        System.out.println(s1.matches(".*"));
        System.out.println(s1.matches("[a-z]*"));
        System.out.println(s1.matches("[xds]*"));
        System.out.println();

        // +: 1 or more
        String s2 = "aac";
        System.out.println(s2.matches(".+"));
        System.out.println(s2.matches("[a-z]+"));
        System.out.println(s2.matches("[xds]+"));

        // {X}: Must be x no. of digits present
        System.out.println(s2.matches("[abc]{3}"));
        // {X}(must contain x no. of digits) , {Y}(limit of total digits)
        System.out.println(s2.matches("[abc]{3}{7}"));

        // check something particular
        // here we are checking its gmail or not
        String s3 = "harshvermajpr1@gmail.com";
        System.out.println(s3.matches(".*gmail.*"));

    }

}
