package searching;

public class SearchInRotateArray {
    public static void main(String[] args) {
        int ar[] = new int[] { 3, 4, 5, 6, 1, 2 };
        System.out.println("INDEX OF GIVEN TARGET ELEMENT: " + find(ar, 3));
    }

    private static int find(int ar[], int target) {

        int start = 0, end = ar.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (ar[mid] == target) {
                return mid;
            }
            if (ar[mid] < ar[end]) {
                if (target > ar[mid] && target <= ar[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= ar[start] && target < ar[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
