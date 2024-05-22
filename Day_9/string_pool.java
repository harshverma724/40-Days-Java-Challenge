public class string_pool {
    public static void main(String[] args) {
        String str1 = "Harsh";
        String str2 = "Harsh";
        if (str1 == str2) {
            System.out.println("String is present in the java object pool.");
        } else {
            System.out.println("String is not present in the java object pool.");
        }

        String str3 = "Harsh";
        String str4 = new String("Harsh");
        if (str3 == str4) {
            System.out.println("String is present in the java object pool.");
        } else {
            System.out.println("String is not present in the java object pool.");
        }

    }

}
