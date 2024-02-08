public class RemoveAllOccurencesOfGivenCharacter {

    public static void main(String[] args) {

        String result = remove("habcdajk", 0, "", 'a');
        System.out.println("RESULT: " + result);
        System.out.println(remove("habcdajk", 0, 'j'));
        System.out.println(remove("habcdajk", 'a'));
    }

    private static String remove(String s, int index, String result, char target) {

        if (index == s.length()) {
            return result;
        }
        if (s.charAt(index) != target)
            result += s.charAt(index);
        return remove(s, index + 1, result, target);

    }

    private static String remove(String s, int index, char target) {

        if (index == s.length()) {
            return "";
        }

        String newString = remove(s, index + 1, target);
        if (s.charAt(index) != target)
            return s.charAt(index) + newString;
        else
            return newString;

    }

    private static String remove(String s, char target) {

        if (s.length() == 0) {
            return "";
        }

        String newString = remove(s.substring(1), target);
        if (s.charAt(0) != target)
            return s.charAt(0) + newString;
        else
            return newString;

    }
}
