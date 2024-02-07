import java.util.Scanner;

public class GenerateSprial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int r = sc.nextInt();
        System.out.println("Enter cols");
        int c = sc.nextInt();
        System.out.println("Generated sprial matrix is : ");
        display(generate(r, c));
    }

    private static int[][] generate(int r, int c) {

        int matrix[][] = new int[r][c];
        int n = 1;
        int topRow = 0;
        int rightCol = c - 1;
        int bottomRow = r - 1;
        int leftCol = 0;

        while (topRow <= bottomRow && leftCol <= rightCol) {

            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = n++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = n++;
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    matrix[bottomRow][i] = n++;
                }
            }
            bottomRow--;
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    matrix[i][leftCol] = n++;
                }
            }
            leftCol++;

        }
        return matrix;
    }

    private static void display(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {

                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
