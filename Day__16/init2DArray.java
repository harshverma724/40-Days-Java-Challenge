public class init2DArray {
    public static void main(String[] args) {

        // Initilization of a 2D array.

        int A[][] = new int[2][3];

        int B[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int C[][];
        C = new int[3][4];

        // JAgged Array.

        int D[][];
        D = new int[3][];
        D[0] = new int[5];
        D[1] = new int[4];
        D[2] = new int[3];

        // Displaying elements of array B.
        // Using for loop.
        for (int i = 0; i < (B.length); i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("");
        // Displaying elements of array B.
        // Using for-each loop.

        for (int x[] : B) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println("");
        }

    }

}
