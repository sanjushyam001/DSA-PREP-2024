package Array.Basic;

public class SmallestAndLargestElement {
    public static void main(String[] args) {
        int ar[] = new int[] { 1, 4, 5, 8, 7 };
        System.out.println("SMALLEST ELEMENT : " + smallestElement(ar));
        System.out.println("LARGEST ELEMENT : " + largestElement(ar));

    }

    private static int smallestElement(int ar[]) {
        int smallestElement = Integer.MAX_VALUE;
        for (int i : ar) {
            smallestElement = Math.min(smallestElement, i);
        }
        return smallestElement;
    }

    private static int largestElement(int ar[]) {
        int largestElement = Integer.MIN_VALUE;
        for (int i : ar) {
            largestElement = Math.max(largestElement, i);
        }
        return largestElement;
    }
}
