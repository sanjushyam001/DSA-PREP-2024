package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int ar[] = new int[] { 1, 4, 5, 2, 8, 7 };
        mergeSort(ar, 0, ar.length - 1);
        System.out.println(Arrays.toString(ar));
    }

    private static void mergeSort(int ar[], int l, int r) {

        if (l >= r)
            return;
        int mid = (l + r) / 2;
        mergeSort(ar, l, mid);
        mergeSort(ar, mid + 1, r);
        merge(l, ar, mid, r);
    }

    private static void merge(int l, int ar[], int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < left.length; i++) {
            left[i] = ar[l + i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = ar[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                ar[k++] = left[i++];
            } else {
                ar[k++] = right[j++];
            }
        }
        while (i < n1) {
            ar[k++] = left[i++];
        }
        while (j < n2) {
            ar[k++] = right[j++];
        }

    }
}
