public class CountDigits {

    public static void main(String[] args) {
        // int countDigit = countDigit(54321, 0);
        // System.out.println("Digits: " + countDigit);
        int count = countDigit(54321);

        System.out.println("Digits: " + count);
    }

    private static int countDigit(int n, int count) {

        if (n >= 0 && n <= 9)
            return count + 1;
        return countDigit(n / 10, count + 1);
    }

    private static int countDigit(int n) {

        if (n >= 0 && n <= 9)
            return 1;
        return countDigit(n / 10) + 1;
    }
}
