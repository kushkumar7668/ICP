package Assignment10;

import java.util.Stack;

public class remove_k_digits {
    class Solution {
        public String removeKdigits(String num, int k) {
            if (num.length() <= k)
                return "0";
            // keep smaller digits at the stat and get rid of k largr ones at first
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < num.length(); i++) {
                char ch = num.charAt(i);
                while (!st.isEmpty() && k > 0 && st.peek() - '0' > ch - '0') {
                    st.pop();
                    k--;
                }
                st.push(ch);
            }
            while (k > 0 && !st.isEmpty()) {
                st.pop();
                k--; // delte remaining bigger ele
            }
            if (st.isEmpty())
                return "0";
            StringBuilder sb = new StringBuilder();
            while (!st.isEmpty()) {
                sb.append(st.pop());
                // st.pop();
            }
            sb.reverse();
            // delete leading zeroes
            while (sb.length() != 0 && sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
            if (sb.length() == 0)
                return "0"; // if all zeroes removed

            return sb.toString();
        }
    }
}
