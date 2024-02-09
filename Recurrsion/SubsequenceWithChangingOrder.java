import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithChangingOrder {
    public static void main(String[] args) {
        System.out.println(subsequences("abc"));
        System.out.println(subsequences("abcd"));
    }

    private static List<String> subsequences(String s) {

        List<String> ans = new ArrayList<>();
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        List<String> subsequences = subsequences(s.substring(1));

        for (String subsequence : subsequences) {
            ans.add(subsequence);
            ans.add(s.charAt(0) + subsequence);

        }
        return ans;
    }

    private static void subsequences(String s, String currResult) {

        if (s.length() == 0) {
            System.out.println(currResult);
            return;
        }
        subsequences(s.substring(1), currResult);
        subsequences(s.substring(1), currResult + s.charAt(0));
    }
}
