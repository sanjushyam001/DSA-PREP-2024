package Array.medium;

public class SubArraysWithEqualSum {
    public static void main(String[] args) {

        int ar[] = new int[] { 4, 2, 1, 2, 5 };
        // boolean result = isEquals(ar);
        // System.out.println(" ADDITION OF TWO SUB ARRAYS ARE EQUALS? " + result);

        boolean optimizedWay = optimizedWay(ar);
        System.out.println("ADDITION OF TWO SUB ARRAYS ARE EQUALS?(optimizedWay) :  " + optimizedWay);

    }

    private static boolean optimizedWay(int ar[]) {

        int total = 0;
        for (int i : ar) {
            total += i;
        }

        int prefix = 0;
        for (int i = 0; i < ar.length; i++) {

            prefix += ar[i];

            if (total - prefix == 0) {
                System.out.println("INDEX IS : " + i);
                return true;
            }
        }
        return false;

    }

    private static boolean isEquals(int ar[]) {

        for (int i = 0; i < ar.length; i++) {
            int prefix = sum(ar, 1, i + 1);
            int suffix = sum(ar, i + 1 + 1, ar.length);
            if (prefix == suffix) {
                System.out.println("INDEX: " + i);
                return true;
            }
        }
        return false;
    }

    private static int sum(int ar[], int l, int r) {
        if (r - 1 > ar.length - 1 || l - 1 < 0) {
            System.out.println("invalid input ! input should be between 1 to 5 ");
            return -1;
        }
        int[] prefixArray = prefixArray(ar);
        if (l == 1 && r == 1) {
            return prefixArray[0];
        }
        if (l == 1) {
            return prefixArray[r - 1];
        }
        return prefixArray[r - 1] - prefixArray[l - 1 - 1];
    }

    private static int[] prefixArray(int ar[]) {

        int prefix[] = new int[ar.length];
        prefix[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            prefix[i] = prefix[i - 1] + ar[i];
        }
        return prefix;
    }
}
