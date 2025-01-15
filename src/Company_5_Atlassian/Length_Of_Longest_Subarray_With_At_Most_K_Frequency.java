package Company_5_Atlassian;

import java.util.HashMap;
// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency
public class Length_Of_Longest_Subarray_With_At_Most_K_Frequency {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int start = 0;

        while(i < nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i]) > k){
                map.put(nums[start],map.getOrDefault(nums[start],0)-1);
//                if(map.get(nums[start]) == 0) map.remove(nums[start]);
                start++;
            }
            ans = Math.max(ans,(i-start));
            i++;
        }
        return ans;
    }
}
