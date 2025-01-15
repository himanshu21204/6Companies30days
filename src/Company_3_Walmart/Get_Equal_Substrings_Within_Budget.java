package Company_3_Walmart;
// https://leetcode.com/problems/get-equal-substrings-within-budget/
public class Get_Equal_Substrings_Within_Budget {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = Integer.MIN_VALUE;
        int start = 0;
        int currCost = 0;

        for (int i = 0; i < s.length(); i++) {
            currCost += Math.abs(s.charAt(i) - t.charAt(i));

            while (currCost > maxCost){
                currCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start--;
            }
            ans = Math.max(ans,(i-start+1));
        }
        return ans;
    }
}
