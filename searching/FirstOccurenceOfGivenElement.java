package searching;

public class FirstOccurenceOfGivenElement {

    public static void main(String[] args) {

        int ar[] = new int[] { 1, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 0 };
        int result = find(ar, 8);
        System.out.println("RESULT: " + result);
    }

    private static int find(int ar[], int targetElement) {

        int start = 0;
        int end = ar.length - 1;
        int firstOccurence = -1;
        while (start < end) {

            int mid = start + (end - start) / 2;

            if (targetElement == ar[mid]) {
                firstOccurence = mid;
                end = mid - 1;
            } else if (targetElement < ar[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstOccurence;
    }
}
