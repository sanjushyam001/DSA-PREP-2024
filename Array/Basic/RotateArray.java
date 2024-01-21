package Array.Basic;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int ar[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        // int result[] = rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5);
        rotateInPlace(ar, 5);
        System.out.println(Arrays.toString(ar));
    }

    private static int[] rotate(int ar[], int k) {

        // [1,2,3,4,5,6,7]
        // rotatedArray[2 to 6]= i ->ar[n-k] to ar[n-1]->[3,4,5,6,7]
        // rotatedArray[0 to 1]= i ->ar[0] to ar[n-k-1]->[1,2]

        int n = ar.length;
        k = k % n;
        int rotatedArray[] = new int[ar.length];
        int index = 0;
        for (int i = n - k; i <= n - 1; i++) {
            rotatedArray[index++] = ar[i];
        }
        for (int i = 0; i <= n - k - 1; i++) {
            rotatedArray[index++] = ar[i];
        }
        return rotatedArray;

    }

    private static void rotateInPlace(int ar[], int k) {
        int n = ar.length;
        k = k % n;
        reverse(ar, 0, n - k - 1);
        reverse(ar, n - k, n - 1);
        reverse(ar, 0, n - 1);
    }

    private static void reverse(int ar[], int i, int j) {

        while (i < j) {

            swap(ar, i, j);

            i++;
            j--;
        }
    }

    private static void swap(int ar[], int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
