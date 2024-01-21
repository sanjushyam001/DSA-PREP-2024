package Array.Basic;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class FindLastOccerenceOfAnElement {

    public static void main(String[] args) {
        int lastIndex = findLastIndex(new int[] { 0, 0, 3, 4, 2, 2, 2 }, 5);
        System.out.println(lastIndex);
        // int lastIndex2 = findLastIndexUsingStream(new int[] { 1, 2, 3, 4, 2, 2, 5 },
        // 2);
        // System.out.println("lastIndex2 " + lastIndex2);
    }

    private static int findLastIndex(int ar[], int target) {

        // for (int i = ar.length - 1; i >= 0; i--) {
        // if (ar[i] == target) {
        // return i;
        // }
        // }
        // return -1;
        int lastIndex = -1;
        for (int i = 0; i < ar.length; i++) {

            if (ar[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;

    }

    private static int findLastIndexUsingStream(int ar[], int target) {

        int lastIndex = IntStream.range(0, ar.length)
                .filter(i -> ar[i] == target)
                .reduce((first, second) -> second)
                .orElse(-1);
        return lastIndex;
    }
}
