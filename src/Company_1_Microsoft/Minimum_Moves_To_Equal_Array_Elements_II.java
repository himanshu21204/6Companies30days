package Company_1_Microsoft;

import java.util.Arrays;
// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
public class Minimum_Moves_To_Equal_Array_Elements_II {
    public static void main(String[] args) {
        System.out.println(minMoves2(new int[]{1,10,2,9}));
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int mid = nums[nums.length/2];
        int count = 0;
        for(int num : nums){
            count += Math.abs(num-mid);
        }
        return count;
    }
}
