package Assignment10;

import java.util.Stack;

public class basic_calculator_II {
    class Solution {
        public int calculate(String s) {
            int num = 0, ans = 0;
            char op = '+';
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch))
                    num = num * 10 + (ch - '0');

                if (!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == s.length() - 1) {
                    if (op == '+')
                        st.push(num);
                    else if (op == '-')
                        st.push(-num);
                    else if (op == '*')
                        st.push(st.pop() * num);
                    else if (op == '/')
                        st.push(st.pop() / num);
                    op = ch;
                    num = 0;
                }
            }
            while (!st.isEmpty())
                ans += st.pop();
            return ans;
        }
    }
}
