import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (final char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        
        return stack.isEmpty();
    }
}

public class leetcode20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "({[]})";
        boolean result = solution.isValid(input);
        System.out.println( result);
    }
}

        

