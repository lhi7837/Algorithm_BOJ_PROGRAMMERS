import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        for(int i : ingredient) {
            stack.push(i);
            idx++;
            // System.out.println(idx + ") " + stack.get(idx-1));
            if(stack.size() >= 4) {
                if(stack.get(idx-4) == 1 && stack.get(idx-3) == 2 && stack.get(idx-2) == 3 && stack.get(idx-1) == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                    idx -= 4;
                }
            }
        }
        return answer;
    }
}