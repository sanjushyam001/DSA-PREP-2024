public class SumOfNaturalAlternativeNumber {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    private static int sum(int n) {

        if (n == 0) {
            return n;
        }
        return (n % 2 == 0 ? (n * -1) : (n)) + sum(n - 1);

    }
}
