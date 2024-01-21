package Array.Basic;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SearchElement {
    public static void main(String[] args) {
        boolean isPresent = isElementPresent(new int[] { 3, 2, 6, 8, 4 }, 8);
        System.out.println(isPresent);
    }

    private static boolean isElementPresent(int ar[], int target) {

        /*
         * for (int i = 0; i < ar.length; i++) {
         * if (ar[i] == target)
         * return true;
         * }
         * return false;
         */

        OptionalInt optionalInt = Arrays.stream(ar).filter((e) -> e == target).findFirst();
        return optionalInt.isPresent();

    }
}
