package searching;

public class SearchMinimumElementInRotateArray {
    public static void main(String[] args) {
        int ar[] = new int[] { 3, 4, 5, 6, 1, 2 };
        System.out.println(find(ar));
    }

    private static int find(int ar[]) {

        int start = 0;
        int n = ar.length - 1;
        int end = n;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ar[mid] > ar[n - 1]) {
                start = mid + 1;
            }
            if (ar[mid] <= ar[n - 1]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
