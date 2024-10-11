import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for(char c : number.toCharArray()) {
            // System.out.println("--- " + c + " ---");
            while(!stack.isEmpty() && stack.peek() < c && cnt < k) {
                cnt++;
                // System.out.println(stack.peek() + " > 빠짐");
                stack.pop();
            }
            stack.push(c);
            // System.out.println(stack.peek() + " < 들어감");
        }
        while(number.length() - stack.size() != k) {
            stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}