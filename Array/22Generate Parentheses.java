package LeetCode;

import java.util.ArrayList;
import java.util.List;

class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, "", 0, 0, n);
        return ans;
    }

    static void helper(List<String> ans, String currentBracket, int open, int close, int max) {
        if (currentBracket.length() == max * 2) {
            ans.add(currentBracket);
            return;
        }

        if (open < max) {

            helper(ans, currentBracket + "(", open + 1, close, max);
        }

        if (close < open) {
            helper(ans, currentBracket + ")", open, close + 1, max);
        }
        return;
    }

}