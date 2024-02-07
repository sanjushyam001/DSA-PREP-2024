public class PowerOfNumber {
    public static void main(String[] args) {

        int power = power(5, 4);
        System.out.println(power);
        power = powerOptimized(5, 4);
        System.out.println(power);
    }

    private static int power(int n, int p) {

        if (p == 0)
            return 1;
        return power(n, p - 1) * n;
    }

    // optimized approach
    private static int powerOptimized(int n, int p) {

        if (p == 0)
            return 1;
        int smallPower = power(n, p / 2);
        if (p % 2 == 0) {
            return smallPower * smallPower;
        }
        return n * smallPower * smallPower;
    }
}
