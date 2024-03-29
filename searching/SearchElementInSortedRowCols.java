package searching;

public class SearchElementInSortedRowCols {
    public static void main(String[] args) {

        int ar[][] = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 22, 30, 34, 60 } };
        boolean result = search(ar, 7);
        System.out.println("ELEMENT PRESENT AT :  " + result);
    }

    // TC O(m+n)
    private static boolean search(int ar[][], int target) {

        // n no of rows ,m no of cols
        int n = ar.length, m = ar[0].length;
        int i = 0, j = m - 1;
        while (i < n && j >= 0) {

            if (target == ar[i][j])
                return true;
            else if (target < ar[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;

    }
}
