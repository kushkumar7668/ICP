package Assignment2;

import java.util.PriorityQueue;

public class Kth_larget_element_in_array {
    class Solution {
        public int findKthLargest(int[] arr, int k) {

            // priority queue uses minHeap by default i.e. minimum element is popped out of
            // queue when writing "pq.poll()".
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < k; i++) {
                pq.add(arr[i]);
            }

            for (int i = k; i < arr.length; i++) {
                if (arr[i] > pq.peek()) {
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
            return pq.peek();
        }
    }
}
