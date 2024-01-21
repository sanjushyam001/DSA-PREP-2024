package Array.Basic;

import java.util.ArrayList;
import java.util.List;

public class TaregetSumInArray {
    public static void main(String[] args) {
        int ar[] = new int[] { 1, 2, 3, 4, 5 };
        List<Integer[]> result = targetSum(ar, 12);
        for (Integer[] i : result) {
            System.out.print("[ ");
            for (Integer e : i) {
                System.out.print(e + " ");
            }
            System.out.print(" ] \n");

        }
    }

    // private static List<Integer[]> targetSum(int ar[], int target) {

    // List<Integer[]> list = new ArrayList<>();
    // for (int i = 0; i < ar.length - 1; i++) {

    // for (int j = i + 1; j < ar.length; j++) {
    // if (target == (ar[i] + ar[j])) {
    // list.add(new Integer[] { i, j });
    // }

    // }
    // }
    // return list;
    // }

    private static List<Integer[]> targetSum(int ar[], int target) {

        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < ar.length - 1; i++) {

            for (int j = i + 1; j < ar.length; j++) {

                for (int k = j + 1; k < ar.length; k++) {
                    if (target == (ar[i] + ar[j] + ar[k])) {
                        list.add(new Integer[] { i, j, k });
                    }

                }
            }
        }
        return list;
    }
}
