package Strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Ifdf Love My India";
        System.out.println(reverseEachWord(s.trim()));
    }

    private static String reverseEachWord(String s) {
        String result = "";
        String newWord = "";
        int lastSpaceIndex = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                // System.out.print(s.charAt(i));
                newWord = newWord + s.charAt(i);
            } else {
                lastSpaceIndex = i;
                String reverseWord = reverse(newWord);
                System.out.println(reverseWord);
                result += reverseWord + " ";
                newWord = "";
            }
        }
        System.out.println("Last Space Index : " + lastSpaceIndex);
        return result + reverse(s.substring(lastSpaceIndex));
    }

    private static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }
}
