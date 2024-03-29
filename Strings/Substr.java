package Strings;

public class Substr {
    public static void main(String[] args) {
        String str = "abcde";
        // System.out.println(str.substring(0, 2));
        // System.out.println(str.substring(2));
        print(str);
    }

    private static void print(String s) {
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < s.length(); j++)
                System.out.println(s.substring(i, j + 1));
            System.out.println("------------------ ----------- ---------- ----------");

        }
    }

}
