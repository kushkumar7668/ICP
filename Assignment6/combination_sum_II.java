
import java.util.*;

public class combination_sum_II {

    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates); // Sort to handle duplicates
            backtrack(candidates, target, ans, new ArrayList<>(), 0);
            return ans;
        }

        private void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> current,
                int index) {
            if (target == 0) {
                ans.add(new ArrayList<>(current)); // Found a valid combination
                return;
            }

            for (int i = index; i < candidates.length; i++) {
                if (i > index && candidates[i] == candidates[i - 1])
                    continue; // Skip duplicates

                if (candidates[i] > target)
                    break; // No point in continuing if the number exceeds target

                current.add(candidates[i]);
                backtrack(candidates, target - candidates[i], ans, current, i + 1); // Move to next index
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

}
