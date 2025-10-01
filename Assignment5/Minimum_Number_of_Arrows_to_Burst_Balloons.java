package Assignment5;

import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

            int prev = points[0][1];
            int count = 1;
            for (int i = 1; i < points.length; i++) {
                // if in range then continue
                if (points[i][0] <= prev) {
                    continue;
                } else {
                    count++;
                    prev = points[i][1];
                }
            }
            return count;
        }
    }
}
