package searching;

public class SearchElementIn2DArray {

    public static void main(String[] args) {

        int ar[][] = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 22, 30, 34, 60 } };
        boolean result = search(ar, 7);
        System.out.println("ELEMENT PRESENT AT :  " + result);
    }

    // TC O(log(m*n))
    private static boolean search(int ar[][], int target) {

        // m no of rows ,n no of cols
        int m = ar.length, n = ar[0].length;
        int start = 0, end = m * n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int midElement = ar[mid / n][mid % n];

            if (target == midElement)
                return true;
            else if (target < midElement) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;

    }
}
