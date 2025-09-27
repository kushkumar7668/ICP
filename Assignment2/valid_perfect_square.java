package Assignment2;

public class valid_perfect_square {
    class Solution {
        public boolean isPerfectSquare(int num) {
            if (num == 1)
                return true;
            int low = 1;
            int high = num;
            int mid = low + (high - low) / 2;
            while (low <= high) {
                if (num / mid == mid && num % mid == 0)
                    return true;
                else if (num / mid > mid)
                    low = mid + 1;
                else
                    high = mid - 1;

                mid = low + (high - low) / 2;

            }
            return false;
        }
    }
}
