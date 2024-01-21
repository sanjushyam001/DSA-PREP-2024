package Array.TwoPointer;

import java.util.Arrays;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int ar[] = new int[] { 1, 0, 0, 1, 1, 0, 1 };
        System.out.println("BEFORE SORT:");
        System.out.println(Arrays.toString(ar));
        sort(ar);
        System.out.println("AFTER SORT:");
        System.out.println(Arrays.toString(ar));
    }

    private static void sort(int ar[]) {

        int left = 0;
        int right = ar.length - 1;

        /*
         * while (true) {
         * 
         * while (ar[left] == 0) {
         * left++;
         * }
         * while (ar[right] == 1) {
         * right--;
         * }
         * if (left > right) {
         * break;
         * } else {
         * swap(ar, left, right);
         * left++;
         * right--;
         * }
         * 
         * }
         * 
         */

        while (left < right) {
            if (ar[left] == 1 && ar[right] == 0) {
                swap(ar, left, right);
                left++;
                right--;
            }
            if (ar[left] == 0)
                left++;
            if (ar[right] == 1)
                right--;

        }
    }

    private static void swap(int ar[], int left, int right) {

        int temp = ar[left];
        ar[left] = ar[right];
        ar[right] = temp;
    }
}
