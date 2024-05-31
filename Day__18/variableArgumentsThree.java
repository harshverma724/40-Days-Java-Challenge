public class variableArgumentsThree {

    static void discount(double... A) {
        double add = 0;

        for (int i = 0; i < A.length; i++) {
            add = add + A[i];
        }
        System.out.println("Total Amount: " + add);
        if (add < 500) {

            System.out.println("Discount Amount: " + add * 0.10);
            System.out.println("Payable Amount: " + (add - (add * 0.10)));
        } else if (add >= 500 && add < 1000) {

            System.out.println("Discount Amount: " + add * 0.15);
            System.out.println("Payable Amount: " + (add - (add * 0.15)));
        } else {

            System.out.println("Discount Amount: " + add * 0.20);
            System.out.println("Payable Amount: " + (add - (add * 0.20)));
        }
    }

    public static void main(String[] args) {

        discount(1044, 13, 13, 13, 13);

    }

}
