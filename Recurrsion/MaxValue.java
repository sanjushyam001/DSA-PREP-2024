public class MaxValue {

    public static void main(String[] args) {

        int ar[] = new int[] { 4, 2, 5, 6, 1 };
        int max = Integer.MIN_VALUE;
        int index = 0;
        int maxValue = maxValue(ar, 0, index);
        System.out.println("MAX VALUE IS : " + maxValue);
        System.out.println("Second Approach : " + maxValue(ar, 0));
    }

    private static int maxValue(int ar[], int index, int max) {

        if (index == ar.length) {
            return max;
        }
        if (ar[index] > max) {
            max = ar[index];
        }
        return maxValue(ar, index + 1, max);
    }

    // 2nd Approach
    private static int maxValue(int ar[], int index) {

        if (index == ar.length - 1) {
            return ar[index];
        }
        int max = maxValue(ar, index + 1);
        if (ar[index] > max) {
            max = ar[index];
        }
        return max;

    }

}