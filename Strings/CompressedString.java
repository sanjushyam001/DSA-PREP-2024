package Strings;

public class CompressedString {

    public static void main(String[] args) {
        String s = "abbccdde";
        System.out.println("Compress String is : " + compress(s));
        System.out.println("Compress String is : " + compress2(s));
    }

    private static String compress(String s) {

        char c = s.charAt(0);
        int count = 1;
        String compressString = "";
        for (int i = 1; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (c == currentCharacter) {
                count++;
            } else {
                compressString += c + "" + count;
                c = currentCharacter;
                count = 1;
            }
            if (i == s.length() - 1) {
                compressString += c + "" + count;
            }
        }
        return compressString;
    }

    private static String compress2(String s) {

        String result = "" + s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {

            char currentCharacter = s.charAt(i);
            char previousCharacter = s.charAt(i - 1);

            if (currentCharacter == previousCharacter) {
                count += 1;
            } else {
                if (count > 1) {
                    result += count;

                }
                count = 1;
                result += currentCharacter;
            }
        }
        if (count > 1) {
            result += count;
        }
        return result;
    }
}
