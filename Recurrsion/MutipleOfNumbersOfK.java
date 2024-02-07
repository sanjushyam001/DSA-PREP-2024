public class MutipleOfNumbersOfK {

    public static void main(String[] args) {

        print(12, 5);
    }

    private static void print(int p, int k) {

        if (k == 0) {
            return;
        }
        print(p, k - 1);
        System.out.print(p * k + " ");
    }
}
