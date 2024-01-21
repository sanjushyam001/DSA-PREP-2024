package Array.Basic;

public class SecondLargest {
    public static void main(String[] args) {
        int result = secondLargest(new int[] { 4, 2, 3, 1, 10 });
        System.out.println(result);
        int result2 = secondLargest1(new int[] { -2, -3, -10 });
        System.out.println(result2);
    }

    private static int secondLargest(int ar[]) {
        int firstLargest = 0;
        int secondLargest = 0;
        if (ar[0] > ar[1]) {
            firstLargest = ar[0];
            secondLargest = ar[1];
        } else {
            firstLargest = ar[1];
            secondLargest = ar[0];
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = ar[i];

            }
            if (ar[i] < firstLargest && ar[i] > secondLargest) {
                secondLargest = ar[i];
            }
        }
        return secondLargest;
    }

    private static int secondLargest1(int ar[]) {

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] == getMaxElement(ar)) {
                ar[i] = Integer.MIN_VALUE;
            }
        }
        int secondLargest = getMaxElement(ar);
        return secondLargest;
    }

    private static int getMaxElement(int ar[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {

            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

}
