public class nestedLoopPatternFour {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((++counter) + " ");

            }
            System.out.println(" ");

        }
    }

}
