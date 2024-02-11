package Sorting;

import java.util.Arrays;

public class MoveAll0atEnd {
    public static void main(String[] args) {

        int ar[] = new int[] { 1, 0, 5, 0, 3, 2 };
        move(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void move(int ar[]) {

        int count = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < ar.length - 1 - i; j++) {

                if (ar[j] == 0 && ar[j + 1] != 0) {
                    count++;
                    flag = true;
                    swap(j, j + 1, ar);
                }
            }
            if (!flag) {
                return;
            }
        }
        System.out.println("COUNT: " + count);
    }

    private static void swap(int i, int j, int ar[]) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
