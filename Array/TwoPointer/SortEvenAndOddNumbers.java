package Array.TwoPointer;

import java.util.Arrays;

public class SortEvenAndOddNumbers {
    public static void main(String[] args) {
        int ar[] = new int[] { 1, 2, 4, 6, 7, 8 };
        System.out.println("BEFORE SORT:");
        System.out.println(Arrays.toString(ar));
        sort(ar);
        System.out.println("AFTER SORT:");
        System.out.println(Arrays.toString(ar));
    }

    private static void sort(int ar[]) {

        int left = 0;
        int right = ar.length - 1;

        while (left < right) {

            if (ar[left] % 2 != 0 && ar[right] % 2 == 0) {
                swap(ar, left, right);
                left++;
                right--;
            }
            if (ar[left] % 2 == 0) {
                left++;
            }
            if (ar[right] % 2 != 0) {
                right--;
            }
        }

    }

    private static void swap(int ar[], int left, int right) {

        int temp = ar[left];
        ar[left] = ar[right];
        ar[right] = temp;
    }
}
