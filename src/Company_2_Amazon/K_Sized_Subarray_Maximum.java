package Company_2_Amazon;

import java.util.*;

// https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
public class K_Sized_Subarray_Maximum {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                list.add(arr[deque.peekFirst()]);
            }
        }

        return list;
    }
}
