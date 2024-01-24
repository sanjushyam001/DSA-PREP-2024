package Array.TwoPointer;

import java.util.Arrays;

/**
 * SortSqare
 */
public class SortSqare {

    public static void main(String[] args) {
        int sortedArray[] = sort(new int[] { -10, 2, -3, 4, 5 });
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] sort(int ar[]) {

        int sortedArray[] = new int[ar.length];

        int left = 0;
        int right = ar.length - 1;
        int index = 0;
        while (left <= right) {

            System.out.print(right + " ");
            if (Math.abs(ar[left]) < Math.abs(ar[right])) {
                sortedArray[index++] = ar[right] * ar[right];
                right--;
            } else {

                sortedArray[index++] = ar[left] * ar[left];
                left++;
                System.out.println("else if");

            }
        }
        return sortedArray;
    }
}