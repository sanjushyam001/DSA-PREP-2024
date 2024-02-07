import java.util.Arrays;
import java.util.Scanner;

public class SprialMatrix {
    public static void main(String[] args) {

        int matrix[][] = matrix(3, 4);
        display(matrix);
        System.out.println("Sprial Matrix : ");
        int sprial[] = sprial(3, 4, matrix);
        System.out.println(Arrays.toString(sprial));
    }

    private static int[] sprial(int rows, int cols, int ar[][]) {

        int result[] = new int[rows * cols];
        int topRow = 0;
        int rightCol = cols - 1;
        int bottomRow = rows - 1;
        int leftCol = 0;

        int totalElements = 0;
        int index = 0;
        while (leftCol <= rightCol && topRow <= bottomRow) {

            // top row
            for (int j = leftCol; j <= rightCol; j++) {
                result[index++] = ar[topRow][j];
                // System.out.print(ar[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            // right col
            for (int i = topRow; i <= bottomRow; i++) {
                result[index++] = ar[i][rightCol];
                totalElements++;
            }
            rightCol--;
            // bottom row
            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--) {
                    result[index++] = ar[bottomRow][j];
                    totalElements++;
                }
            }
            bottomRow--;
            // left col
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result[index++] = ar[i][leftCol];
                    totalElements++;
                }
            }
            leftCol++;
        }

        return result;

    }

    private static int[][] matrix(int rows, int cols) {
        Scanner sc = new Scanner(System.in);

        int result[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter rows " + i + 1);
            for (int j = 0; j < cols; j++) {
                result[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return result;
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
