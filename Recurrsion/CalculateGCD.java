public class CalculateGCD {
    public static void main(String[] args) {
        System.out.println(calculate(12, 16));
    }

    // Brute Force
    // private static int calculate(int a, int b) {

    // int result = 0;
    // for (int i = Math.min(a, b); i >= 1; i--) {
    // if (a % i == 0 && b % i == 0) {
    // result = i;
    // break;

    // }

    // }
    // return result;

    // }

    // private static int calculate(int a, int b) {

    // int divisor = Math.min(a, b);
    // int dividend = Math.max(a, b);

    // while (true) {
    // int remainder = dividend % divisor;
    // if (remainder == 0) {
    // break;
    // }
    // dividend = divisor;
    // divisor = remainder;

    // }
    // return divisor;
    // }
    private static int calculate(int a, int b) {

        if (b == 0)
            return a;
        return calculate(b, a % b);
    }
}
