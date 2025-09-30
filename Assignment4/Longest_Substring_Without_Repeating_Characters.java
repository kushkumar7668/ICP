package Assignment4;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int left = 0;
            int right = 0;
            int maxlen = 0;

            while (right < s.length()) {

                char ch = s.charAt(right);

                while (set.contains(ch)) {
                    set.remove(s.charAt(left));
                    left++;
                }

                maxlen = Math.max(maxlen, right - left + 1);

                set.add(s.charAt(right));
                right++;
            }

            return maxlen;
        }
    }
}
