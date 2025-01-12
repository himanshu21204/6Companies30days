package Company_4_Google;

import java.util.PriorityQueue;

// https://leetcode.com/problems/maximum-product-after-k-increments/description/
public class Maximum_Product_After_K_Increments {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all elements to the priority queue
        for (int num : nums) {
            pq.add(num);
        }

        // Increment smallest elements efficiently
        while (k-- > 0) {
            int smallest = pq.poll();
            smallest++;
            pq.add(smallest);
        }
        // Calculate the product of all elements in the priority queue
        long product = 1;
        int MOD = 1_000_000_007;
        while (!pq.isEmpty()) {
            product = (product * pq.poll()) % MOD;
        }

        return (int) product;
    }
}
