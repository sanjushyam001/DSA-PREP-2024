package Array.Basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountOccurenceOfElement {
    public static void main(String[] args) {

        int ar[] = new int[] { 1, 2, 3, 2, 2, 2, 0 };
        // int result = count(ar, 2);
        // System.out.println("Occurence of given target :" + result);
        int result = countUsingStream(ar, 2);
        System.out.println("Occurence of given target :" + result);

    }

    private static int count(int ar[], int target) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == target) {
                count++;
            }
        }
        return count;
    }

    private static int countUsingStream(int ar[], int target) {

        IntStream stream = Arrays.stream(ar);
        int count = (int) stream.filter(e -> e == target).count();
        // long count = Arrays.stream(ar).filter(e -> e == target).count();
        return count;
    }
}
