package Company_3_Walmart;
import java.util.*;
// https://leetcode.com/problems/extra-characters-in-a-string/
public class Extra_Characters_In_A_String {
    public static void main(String[] args) {
        System.out.println(minExtraChar("leetscode",new String[]{"leet","code","leetcode"}));
    }
    public static int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet<>();
        for(String temp : dictionary){
            set.add(temp);
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = n;
        }
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (set.contains(sub)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);
        }

        return dp[n];
    }
}
