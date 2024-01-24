public class Transpose90 {
    public static void main(String[] args) {
        int ar[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println("BEFORE TRANSPOSE");
        display(ar);
        transpose(ar);
        System.out.println("AFTER TRANSPOSE");
        display(ar);

    }

    private static void transpose(int ar[][]) {
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[j][n - 1 - i] = ar[i][j];
            }
        }
    }

    private static void display(int ar[][]) {
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ar[i][j] <= 9)
                    System.out.print(ar[i][j] + "  ");
                else
                    System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
