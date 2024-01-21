package Array.Basic;

import java.util.Arrays;

public class IsArraySort {

    public static void main(String[] args) {

        int ar[] = new int[] { 1, 3, 2, 4, 5, 5 };

    
        boolean isSorted = isSorted(ar);
        if (isSorted) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }

    private static boolean isSorted(int ar[]) {

        if (ar.length == 1) {
            return true;
        }
        for (int i = 1; i < ar.length; i++) {
            if (ar[i - 1] > ar[i])
                return false;
        }
        return true;
    }

}
