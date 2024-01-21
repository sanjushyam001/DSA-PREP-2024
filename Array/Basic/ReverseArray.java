package Array.Basic;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int ar[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(ar));

        // int result[] = reverse(ar);
        // for (int i : result) {
        // System.out.print(i + " ");
        // }

        reverseInPlace(ar);
        System.out.println(Arrays.toString(ar));

    }

    private static int[] reverse(int ar[]) {
        int copyArray[] = new int[ar.length];
        int index = 0;
        for (int i = ar.length - 1; i >= 0; i--) {
            copyArray[index++] = ar[i];
        }
        return copyArray;
    }

    private static void reverseInPlace(int ar[]) {
        int i = 0;
        int j = ar.length - 1;
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
