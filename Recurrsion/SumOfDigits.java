public class SumOfDigits {

    public static void main(String[] args) {

        int sum = sum(54321);
        System.out.println("SUM: " + sum);
    }

    private static int sum(int n) {

        if (n >= 0 && n <= 9)
            return n;
        return sum(n / 10) + n % 10;
    }
}
