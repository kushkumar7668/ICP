import java.util.ArrayList;
import java.util.List;

public class combinations {
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<Integer> ll = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            helper(1, n, k, ll, ans);
            return ans;
        }

        public void helper(int start, int n, int k, List<Integer> ll, List<List<Integer>> ans) {
            if (k == 0) {
                ans.add(new ArrayList<>(ll));
                return;
            }
            if (start > n) {
                return;
            }
            ll.add(start);
            helper(start + 1, n, k - 1, ll, ans);
            ll.remove(ll.size() - 1);
            helper(start + 1, n, k, ll, ans);

        }

    }

}
