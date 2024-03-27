import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        for(char c : s.toCharArray()) {
            if(stack.size() == 0 && ')' == c) return false;
            if('(' == c) {
                stack.add(c);
                idx++;
            }
            else if(')' == c) {
                if(idx > 0) {
                    stack.add(c);
                    idx--;
                }
                else
                    return false;
            }
        }
        if(stack.peek() == '(') return false;
        
        return idx == 0 ? true : false;
    }
}