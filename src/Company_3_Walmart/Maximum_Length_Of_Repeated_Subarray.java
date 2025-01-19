package Company_3_Walmart;

// https://leetcode.com/problems/maximum-length-of-repeated-subarray
public class Maximum_Length_Of_Repeated_Subarray {
    public static void main(String[] args) {
        System.out.println(findLength(new int[]{1,2,3,2,1},new int[]{3,2,1,4,7}));
    }
    public static int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        int ans = 0;

        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(dp[i][j],ans);
                }else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
}
