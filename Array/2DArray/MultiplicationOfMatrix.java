import java.util.Scanner;

public class MultiplicationOfMatrix {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int r1 = 2, c1 = 4;
        int r2 = 4, c2 = 3;
        int ar1[][] = new int[r1][c1];
        int ar2[][] = new int[r2][c2];
        System.out.println("Construct Matrix 1 :");
        ar1 = constructMatrix(ar1);
        display(ar1);
        System.out.println("Construct Matrix 2 :");
        display(ar2);
        ar2 = constructMatrix(ar2);
        if (c1 != r2) {
            System.out.println("Sorry ! columns of matrix1 and rows of matrix 2 must be same ");
        } else {
            int multiple[][] = new int[r1][c2];
            multiple = multiply(c1, r1, c2, multiple, ar1, ar2);
            System.out.println("MULTIPLICATION OF GIVEN MATRICES");
            display(multiple);
        }
    }

    private static int[][] multiply(int a, int r1, int c2, int multiple[][], int ar1[][], int ar2[][]) {

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < a; k++) {
                    multiple[i][j] += ar1[i][k] * ar2[k][j];
                }
            }
        }
        return multiple;
    }

    private static int[][] constructMatrix(int ar[][]) {
        int result[][] = new int[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter " + (i + 1) + "row ");
            for (int j = 0; j < ar[0].length; j++) {

                result[i][j] = sc.nextInt();
            }

        }
        return result;
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
