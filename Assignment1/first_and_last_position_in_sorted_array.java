package Assignment1;

public class first_and_last_position_in_sorted_array {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int first = findFirst(nums, target);
            int last = findLast(nums, target);
            return new int[] { first, last };
        }

        // LOGIC : find the first occurance and last occurance of the target value and
        // return them as an array.
        // binary search->
        private int findFirst(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int first = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    first = mid;
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return first;
        }

        private int findLast(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int last = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    last = mid;
                    left = mid + 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return last;
        }
    }
}
