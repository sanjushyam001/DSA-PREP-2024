public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("abcd"));
    }

    private static String reverse(String s) {

        if (s.length() == 0) {
            return "";
        }
        String newString = reverse(s.substring(1));
        return newString + s.charAt(0);
    }
}
