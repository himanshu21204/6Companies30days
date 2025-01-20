package Company_6_Goldman_sachs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// https://leetcode.com/problems/query-kth-smallest-trimmed-number/description/
public class Query_Kth_Smallest_Trimmed_Number {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallestTrimmedNumbers(new String[]{"102","473","251","814"},new int[][]{{1,1},{2,3},{4,2},{1,2}})));
    }
    public static int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int queryCount = queries.length;
        int[] ans = new int[queryCount];
        for (int i = 0; i < queryCount; i++) {
            int k = queries[i][0];
            int trim = queries[i][1];
            PriorityQueue<int[]> pq = new PriorityQueue<>(
                    (a, b) -> {
                        String strA = nums[a[1]].substring(nums[a[1]].length() - trim);
                        String strB = nums[b[1]].substring(nums[b[1]].length() - trim);
                        int cmp = strA.compareTo(strB);
                        return cmp == 0 ? a[1] - b[1] : cmp;
                    }
            );
            for (int j = 0; j < nums.length; j++) {
                pq.offer(new int[]{j, j});
            }
            while (k-- > 1) {
                pq.poll();
            }
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}
