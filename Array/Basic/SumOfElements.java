package Array.Basic;

import java.util.Arrays;

public class SumOfElements {

    public static void main(String[] args) {
        int sum = sumOfElements(new int[] { 10, 20, 30, 40 });
        System.out.println("Sum: " + sum);
    }

    private static int sumOfElements(int ar[]) {
        int sum = 0;

        // for (int i = 0; i < ar.length; i++) {
        // sum += ar[i];
        // }

        /*
         * for (int i : ar) {
         * sum += i;
         * }
         */
        sum = Arrays.stream(ar).sum();
        return sum;
    }

}
