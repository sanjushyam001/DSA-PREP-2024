package Strings;

public class PalindromInSubstring {
    public static void main(String[] args) {

        int count = count("abcba");
        System.out.println("Numbers of palindrome substring : " + count);
    }

    private static int count(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                if (isPalindrome(s.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPalindrome(String s) {

        int i = 0, j = s.length() - 1;
        while (i <= j) {

            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;

    }
}
