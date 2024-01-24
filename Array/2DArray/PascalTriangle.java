import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int rows = sc.nextInt();
        int pascalArray[][] = pascal(rows);
        display(pascalArray);

    }

    private static int[][] pascal(int rows) {

        int p[][] = new int[rows][];

        for (int i = 0; i < rows; i++) {

            p[i] = new int[i + 1];
            p[i][0] = p[i][i] = 1;

            for (int j = 1; j < p[i].length - 1; j++) {
                p[i][j] = p[i - 1][j] + p[i - 1][j - 1];
            }
        }
        return p;
    }

    private static void display(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}
