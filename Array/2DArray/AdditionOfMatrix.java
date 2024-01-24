/**
 * additionOfMatrix
 */
public class AdditionOfMatrix {

    public static void main(String[] args) {
        int ar1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int ar2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        if (ar1.length != ar1.length || ar1[0].length != ar2[0].length) {
            System.out.println("Sorry! invalid input rows cols of both matrices must be same in length !");
        } else {
            int addition[][] = addition(ar1, ar2);
            System.out.println("\nADDITION OF TWO MATRIX: \n");

            display(addition);
        }
    }

    private static int[][] addition(int ar1[][], int ar2[][]) {

        int[][] addition = new int[ar1.length][ar1[0].length];

        System.out.println("First Matrix is : ");
        display(ar1);
        System.out.println("Second Matrix is : ");
        display(ar2);
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[0].length; j++) {
                addition[i][j] = ar1[i][j] + ar2[i][j];

            }

        }
        return addition;
    }

    private static void display(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {

                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}