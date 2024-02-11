package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int ar[] = new int[] { 1, 4, 5, 2, 3 };
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void sort(int ar[]) {

        for (int i = 0; i < ar.length; i++) {

            int min = i;

            for (int j = i + 1; j < ar.length - 1; j++) {

                if (ar[min] > ar[j]) {
                    min = j;
                }

            }
            if (min != i)
                swap(min, i, ar);
        }
    }

    private static void swap(int i, int j, int ar[]) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
