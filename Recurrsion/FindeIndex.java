import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindeIndex {
    public static void main(String[] args) {
        int ar[] = new int[] { 1, 5, 5, 7, 8 };
        System.out.println(firstIndex(ar, 0, 5));
        System.out.println(lastIndex(ar, 0, 5));
        System.out.println(findAllIndices(ar, 0, 5, new ArrayList<>()));
    }

    private static int firstIndex(int ar[], int index, int target) {

        if (index == ar.length) {
            return -1;
        }
        if (ar[index] == target) {
            return index;
        }
        return firstIndex(ar, index + 1, 5);
    }

    private static int lastIndex(int ar[], int index, int target) {

        if (index == ar.length) {
            return -1;
        }

        int value = lastIndex(ar, index + 1, target);
        if (value == -1 && ar[index] == target) {
            return index;
        }
        return value;
    }

    private static List<Integer> findAllIndices(int ar[], int index, int target, List<Integer> indices) {

        if (index == ar.length) {
            return indices;
        }
        if (ar[index] == target) {
            indices.add(index);
        }

        return findAllIndices(ar, index + 1, target, indices);

    }
}
