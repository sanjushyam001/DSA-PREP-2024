package Strings;

/**
 * Toggle
 */
public class Toggle {

    public static void main(String[] args) {

        String s = "I Love My India";
        System.out.println("String is : " + s);
        System.out.println("Toggle String is : " + toggle(s));

        System.out.println("Toggle String using StringBuilder is : " + toggleUsingStringBuilder(s));
    }

    private static String toggle(String s) {

        String toggleString = "";
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int asciiValue = (int) (ch);
            if (asciiValue >= 65 && asciiValue <= 90) {
                ch = (char) (asciiValue + 32);
            } else if (asciiValue >= 97 && asciiValue <= 122) {
                ch = (char) (asciiValue - 32);
            } else {
                ch = ch;
            }
            toggleString += ch;
        }
        return toggleString;

    }

    private static StringBuilder toggleUsingStringBuilder(String s) {

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {

            char ch = sb.charAt(i);
            int asciiValue = (int) (ch);
            if (asciiValue >= 65 && asciiValue <= 90) {
                sb.setCharAt(i, (char) (ch + 32));
            } else if (asciiValue >= 97 && asciiValue <= 122) {
                sb.setCharAt(i, (char) (ch - 32));
            }

        }
        return sb;

    }
}