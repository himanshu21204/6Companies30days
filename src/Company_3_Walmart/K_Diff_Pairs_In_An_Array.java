package Company_3_Walmart;
import java.util.*;
// https://leetcode.com/problems/k-diff-pairs-in-an-array
public class K_Diff_Pairs_In_An_Array {
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3,1,4,1,5},2));
    }
    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for (int i : map.keySet()) {
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1) {
                result++;
            }
        }
        return result;
    }
}
