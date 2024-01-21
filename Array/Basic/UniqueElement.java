package Array.Basic;

public class UniqueElement {
    public static void main(String[] args) {

        int result = getUniqueElement(new int[] { 1, 2, 4, 4, 1, 2 });
        System.out.println("RESULT: " + result);
    }

    private static int getUniqueElement(int ar[]) {

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    ar[i] = -1;
                    ar[j] = -1;
                }
            }
        }
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] > 0)
                return ar[j];
        }
        return -1;

    }
}
