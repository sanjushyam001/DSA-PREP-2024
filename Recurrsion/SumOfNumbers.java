public class SumOfNumbers {

    public static void main(String[] args) {
        int ar[] = new int[] { 4, 2, 5, 6, 1 };
        System.out.println("SUM OF NUMBERS :" + sum(ar, 0));
    }

    private static int sum(int ar[], int index) {

        if (index == ar.length - 1) {
            return ar[index];
        }
        return ar[index] + sum(ar, index + 1);
    }
}
