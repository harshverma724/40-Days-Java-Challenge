public class stringMethods {
    public static void main(String[] args) {

        // Length Method
        String s1 = "Harsh";
        System.out.println(s1.length());

        // Lowercase Method
        String s2 = "Harsh Verma";
        System.out.println(s2.toLowerCase());

        // Uppercase Method
        String s3 = "Harsh Verma";
        System.out.println(s3.toUpperCase());

        // Trim Method
        String s4 = "          Harsh Verma            ";
        System.out.println(s4.trim());

        // Substring Method
        String s5 = "Programming";
        System.out.println(s5.substring(3));
        System.out.println(s5.substring(4, 9));

        // Replace Method
        String s6 = "Python Programming";
        System.out.println(s6.replace("Python", "Java"));

        // StartsWith Method
        String s7 = "Harsh Verma";
        System.out.println(s7.startsWith("Ha"));

        // EndsWith Method
        String s8 = "Kendriya Vidyalaya";
        System.out.println(s8.endsWith("ya"));

        // charAt Method
        String s9 = "Kendriya Vidyalaya";
        System.out.println(s9.charAt(6));

        // indexOf Method
        String s10 = "Kendriya Vidyalaya";
        System.out.println(s10.indexOf("y"));
        // mention starting point
        System.out.println(s10.indexOf("y", 7));

        // lastIndexOf Method
        String s11 = "Kendriya Vidyalaya";
        System.out.println(s11.lastIndexOf("Vidyalaya"));

        // equals Method
        String s12 = "Puzzle";
        String s13 = "Puzzle";
        String s14 = new String("Puzzle");
        String s15 = "puzzle";

        // == compares through Refrences.
        // .equals compares through Strings.
        System.out.println(s12.equals(s13));
        System.out.println(s12 == s13);

        System.out.println(s12.equals(s14));
        System.out.println(s12 == s14);

        // equalsIgnoreCase Method
        System.out.println(s12.equalsIgnoreCase(s15));

        // compareTo Method
        // -value(difference between their ASCII codes) : When comparision string is
        // bigger
        // 0 : When both Strings are equal
        // +value(difference between their ASCII codes) : when compared string is bigger

        String s16 = "Europe";
        String s17 = "America";
        String s18 = "Europe";

        System.out.println(s17.compareTo(s16));
        System.out.println(s16.compareTo(s18));
        System.out.println(s16.compareTo(s17));

        // contains Method

        String s19 = "The creat wall of china";
        String s20 = "wall";
        System.out.println(s19.contains(s20));

        // concat Method

        String s21 = "Education";
        String s22 = "System";
        System.out.println(s21.concat(s22));
        System.out.println(s21 + s22);

    }

}
