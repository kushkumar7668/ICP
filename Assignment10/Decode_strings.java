package Assignment10;

import java.util.Stack;

public class Decode_strings {
    class Solution {
        public String decodeString(String s) {
            Stack<Integer> cnt = new Stack<>();
            Stack<String> res = new Stack<>();
            String ans = "";
            int i = 0;
            while (i < s.length()) {
                if (Character.isDigit(s.charAt(i))) {
                    int count = 0;
                    while (Character.isDigit(s.charAt(i))) {
                        count = 10 * count + (s.charAt(i) - '0');
                        i += 1;
                    }
                    cnt.push(count);
                } else if (s.charAt(i) == '[') {
                    res.push(ans);
                    ans = "";
                    i += 1;
                } else if (s.charAt(i) == ']') {
                    StringBuilder temp = new StringBuilder(res.pop());
                    int c = cnt.pop();
                    for (int j = 0; j < c; j++)
                        temp.append(ans);
                    ans = temp.toString();
                    i += 1;
                } else {
                    ans += s.charAt(i);
                    i++;
                }
            }
            return ans;
        }
    }
}
