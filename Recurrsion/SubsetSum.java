public class SubsetSum {
    public static void main(String[] args) {
        int ar[] = new int[] { 1, 2, 3, 4 };
        subsetSum(ar, ar.length, 0, 0);
    }

    private static void subsetSum(int ar[], int n, int index, int sum) {

        if (index >= n) {
            System.out.println(sum);
            return;
        }

        subsetSum(ar, n, index + 1, sum + ar[index]);
        subsetSum(ar, n, index + 1, sum);
    }
}
