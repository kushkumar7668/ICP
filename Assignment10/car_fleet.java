package Assignment10;

import java.util.Arrays;
import java.util.Stack;

public class car_fleet {
    class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
            int[][] ar = new int[speed.length][2];
            for (int i = 0; i < speed.length; i++) {
                ar[i][0] = position[i];
                ar[i][1] = speed[i];
            }
            Arrays.sort(ar, (a, b) -> a[0] - b[0]);
            Stack<Double> st = new Stack<>();
            for (int[] a : ar) {
                if (a[0] > target)
                    continue;
                double fleet = (target - a[0]) / (1.0 * a[1]);
                while (!st.isEmpty() && st.peek() <= fleet)
                    st.pop();
                st.push(fleet);
            }
            return st.size();
        }
    }
}
