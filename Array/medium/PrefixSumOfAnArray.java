package Array.medium;

public class PrefixSumOfAnArray {
    public static void main(String[] args) {

        int ar[] = new int[] { 1, 2, 3, 4, 5 };
        int sum = sum(ar, 2, 4);
        System.out.println("SUM: " + sum);
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
