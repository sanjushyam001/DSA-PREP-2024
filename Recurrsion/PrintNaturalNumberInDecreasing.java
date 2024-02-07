public class PrintNaturalNumberInDecreasing {

    public static void main(String[] args) {

    }

    private static void print(int n) {

        // base work
        if (n == 1) {
            System.out.print(n + " ");
        }
        // self work
        System.out.print(n + " ");
        // recursive
        print(n - 1);
    }
}
