package Assignment3;

public class search_a_2Dmatrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length, n = matrix[0].length;
            int left = 0, right = m * n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int midValue = matrix[mid / n][mid % n]; // Convert 1D index to 2D indices

                if (midValue == target) {
                    return true;
                } else if (target > midValue) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return false;
        }
    }
}
