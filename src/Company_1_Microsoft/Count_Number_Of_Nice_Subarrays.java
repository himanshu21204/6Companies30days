package Company_1_Microsoft;
// https://leetcode.com/problems/count-number-of-nice-subarrays/description/
public class Count_Number_Of_Nice_Subarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    int atMostK(int[] nums, int k) {
        int count = 0;
        int result = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] % 2 == 1) {
                k--;
            }

            while (k < 0) {
                if (nums[start] % 2 == 1) {
                    k++;
                }
                start++;
            }
            result += end - start + 1;
        }

        return result;
    }
}
