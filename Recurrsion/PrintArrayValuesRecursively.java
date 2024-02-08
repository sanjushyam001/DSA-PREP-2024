public class PrintArrayValuesRecursively {

    public static void main(String[] args) {
        int ar[] = new int[] { 1, 4, 7, 8, 0 };
        print(ar, 0);
    }

    private static void print(int ar[], int index) {

        if (index == ar.length)
            return;
        System.out.print(ar[index] + " ");

        print(ar, ++index);
    }
}
