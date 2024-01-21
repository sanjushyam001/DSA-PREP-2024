package Array.Basic;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxElement {
    public static void main(String[] args) {
        int max = maxElement(new int[] { 1, 4, 7, 8, 9, 5 });
        System.out.println("MAX ELEMENT: " + max);
    }

    private static int maxElement(int ar[]) {

        int max = Integer.MIN_VALUE;
        /*
         * for (int i = 0; i < ar.length; i++) {
         * if (ar[i] > max) {
         * max = ar[i];
         * }
         * }
         */
        /*
         * for (int i : ar) {
         * max = Integer.max(max, i);
         * }
         */
        IntStream stream = Arrays.stream(ar);
        OptionalInt optionalInt = stream.max();
        max = optionalInt.getAsInt();
        return max;
    }
}
