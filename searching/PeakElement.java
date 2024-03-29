package searching;

public class PeakElement {

    public static void main(String[] args) {
        int ar[] = new int[] { 2, 4, 10, 7, 3, 1, 0 };
        int peakElementIndex = findPeakElement(ar);
        System.out.println("PEAK ELEMENT INDEX : " + peakElementIndex + " AND ELEMENT IS " + ar[peakElementIndex]);
    }

    private static int findPeakElement(int ar[]) {

        int start = 0, end = ar.length - 1;
        int peakElementIndex = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (ar[mid] < ar[mid + 1]) {

                peakElementIndex = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return peakElementIndex;

    }
}
