/**
 * BoundedMatrixSum
 */
public class BoundedMatrixSum {

    public static void main(String[] args) {
        int ar[][] = new int[8][8];
        for (int i[] : ar) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        ar = constructMatrix(ar);
        System.out.println();
        for (int i[] : ar) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(sum(ar, 3, 0, 5, 0));
    }

    private static int[][] constructMatrix(int ar[][]) {

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = 1;
            }

        }
        return ar;

    }

    private static int sum(int ar[][], int l1, int r1, int l2, int r2) {

        int p[] = new int[ar.length];
        p[0] = 1;
        for (int j = 1; j < ar.length; j++) {
            p[j] += ar[0][j] + p[j - 1];
        }

        int s = 0;
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1)
                s += p[r2] - p[r1 - 1];
            else
                s += p[r2];
        }
        return s;
    }
}
