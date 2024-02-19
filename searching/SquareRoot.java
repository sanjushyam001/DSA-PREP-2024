package searching;

public class SquareRoot {
    public static void main(String[] args) {

        int sqRoot = 24;
        int result = findSqRoot(sqRoot);
        System.out.println("RESULT: " + result);
        result = findSqRootByBinarySearch(sqRoot);
        System.out.println("RESULT: " + result);
    }

    private static int findSqRoot(int sqRoot) {

        int y = 0;
        while (y * y <= sqRoot) {
            y++;
        }
        return y - 1;
    }

    private static int findSqRootByBinarySearch(int sqRoot) {

        int start = 0, end = sqRoot;
        int ans = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2; // 12,5
            int value = mid * mid; // 144,25,4,9

            if ( value== sqRoot) {//
                return mid;
            } else if (sqRoot < value) {
                end = mid - 1; // 11,4
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
