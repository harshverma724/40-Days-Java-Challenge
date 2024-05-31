public class validateNameAge {

    boolean validate(String a) {
        if (a.matches("[a-zA-Z\\s]+")) {
            return true;
        } else {
            return false;
        }

    }

    boolean validate(int a) {
        if (a >= 3 && a <= 15) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        validateNameAge method = new validateNameAge();
        System.out.println(method.validate("harsh"));
        System.out.println(method.validate(15));

    }

}
