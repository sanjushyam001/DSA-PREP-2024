class Palindrome {

    public static void main(String[] args) {

        System.out.println("RESULT: " + palindrome(121));
    }

    private static boolean palindrome(int n) {
        System.out.println("HI");
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            System.out.println("HELLO");
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println("REVERSE: " + rev);
        return n == rev;
    }
}