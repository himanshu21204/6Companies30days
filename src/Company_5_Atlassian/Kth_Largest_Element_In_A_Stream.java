package Company_5_Atlassian;
import java.util.*;
// https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
public class Kth_Largest_Element_In_A_Stream {
    public static void main(String[] args) {
        KthLargest k = new KthLargest(3,new int[]{4, 5, 8, 2});
        int[] ar = {3,5,10,9,4};
        for (int i = 0; i < 5; i++) {
            System.out.println(k.add(ar[i]));
        }
    }
    static class KthLargest {
        private int k;
        private PriorityQueue<Integer> minHeap;
        public KthLargest(int k, int[] nums) {
            this.k = k;
            minHeap = new PriorityQueue<>(k);
            for (int num : nums) {
                if (minHeap.size() < k) {
                    minHeap.offer(num);
                } else if (num > minHeap.peek()) {
                    minHeap.offer(num);
                    if (minHeap.size() > k) {
                        minHeap.poll();
                    }
                }
            }
        }

        public int add(int val) {
            if (minHeap.size() < k) {
                minHeap.offer(val);
            } else if (val > minHeap.peek()) {
                minHeap.offer(val);
                minHeap.poll();
            }
            return minHeap.peek();
        }
    }

}
