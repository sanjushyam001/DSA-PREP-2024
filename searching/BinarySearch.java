package searching;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {

        int ar[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println(search(ar, 90));
        System.out.println(recursiveSearch(ar, 0, ar.length - 1, 7));
    }

    private static boolean search(int ar[], int target) {

        int first = 0;
        int last = ar.length - 1;

        while (first <= last) {

            int mid = (first) + (last - first) / 2;
            if (target == ar[mid]) {
                return true;
            } else if (target < ar[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }

        }
        return false;
    }

    private static boolean recursiveSearch(int ar[], int first, int last, int target) {

        if (first > last)
            return false;
        int mid = (first) + (last - first) / 2;
        if (target == ar[mid]) {
            return true;
        } else if (target < ar[mid]) {
            return recursiveSearch(ar, first, mid - 1, target);
        } else {
            return recursiveSearch(ar, mid + 1, last + 1, target);
        }
    }
}