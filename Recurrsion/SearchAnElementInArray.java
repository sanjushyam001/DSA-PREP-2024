public class SearchAnElementInArray {
    public static void main(String[] args) {
        int ar[] = new int[] { 4, 2, 5, 6, 1 };
        boolean isPresent = searchElement(ar, 0, 0);
        System.out.println(isPresent);
    }

    private static boolean searchElement(int ar[], int index, int target) {

        if (index == ar.length) {
            return false;
        }
        if (ar[index] == target) {
            return true;
        }
        return searchElement(ar, index + 1, target);

    }

}
