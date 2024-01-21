package Array.Basic;

public class FirstRepeatedElement {
    public static void main(String[] args) {

        int result = findFirstRepeatedElement(new int[] { 1, 2, 3, 1, 4, 5, 6, 7, 6, 8 });
        System.out.println("FIRST REPEATED ELEMENT IS : " + result);
        int lastRepeatedElement = findLastRepeatedElement(new int[] { 1, 2, 3, 1, 4, 5, 6, 7, 6, 8, 8, 6 });
        System.out.println("LAST REPEATED ELEMENT IS : " + lastRepeatedElement);
    }

    private static int findFirstRepeatedElement(int ar[]) {

        for (int i = 0; i < ar.length - 1; i++) {

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    return ar[i];
                }
            }
        }
        return -1;
    }

    private static int findLastRepeatedElement(int ar[]) {

        int lastRepeatedElement = -1;
        for (int i = 0; i < ar.length - 1; i++) {

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    lastRepeatedElement = ar[i];
                }
            }
        }
        return lastRepeatedElement;
    }
}
