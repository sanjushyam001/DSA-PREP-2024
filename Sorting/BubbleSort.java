package Sorting;

import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int ar[] = new int[] { 1, 4, 5, 2, 3 };
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void sort(int ar[]) {

        for (int i = 0; i < ar.length; i++) {

            boolean flag = false;
            for (int j = 0; j < ar.length - 1 - i; j++) {

                if (ar[j + 1] < ar[j]) {
                    swap(j + 1, j, ar);
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    private static void swap(int i, int j, int ar[]) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
