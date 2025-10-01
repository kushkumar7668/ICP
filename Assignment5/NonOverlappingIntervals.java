package Assignment5;

import java.util.Arrays;

public class NonOverlappingIntervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
            int p1 = intervals[0][1];
            int c = 0;
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < p1) {
                    c++;
                } else {
                    p1 = intervals[i][1];
                }
            }
            return c;
        }
    }
}
