package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int ar[] = new int[] { 1, 4, 5, 2, 3 };
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void sort(int ar[]) {

        for (int i = 1; i < ar.length; i++) {

            int j = i;
            while (j > 0 && ar[j] < ar[j - 1]) {
                swap(j, j - 1, ar);
                j--;
            }
        }
    }

    private static void swap(int i, int j, int ar[]) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
