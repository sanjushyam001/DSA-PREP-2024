public class TransposeMatrix {
    public static void main(String[] args) {
        int ar[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 }, { 8, 7, 6, 5 } };

        if (ar.length != ar[0].length) {
            System.out.println("Matrix should be square in shape! rows and columns should be same in length");
            return;
        }
        System.out.println("Before transpose:");

        display(ar);
        ar = transpose(ar);
        System.out.println("After transpose:");
        display(ar);
    }

    private static int[][] transpose(int ar[][]) {

        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar[i].length; j++) {
                swap(ar, i, j);
            }
        }
        return ar;
    }

    private static void swap(int ar[][], int i, int j) {
        int temp = ar[i][j];
        ar[i][j] = ar[j][i];
        ar[j][i] = temp;
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
