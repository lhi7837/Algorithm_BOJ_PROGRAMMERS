import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int[] priority = new int[order.length];
        for(int i = 0; i < order.length; i++) {
            priority[order[i] - 1] = i;
        }
        Stack<Integer> sub = new Stack<>();
        int target = 0;
        for(int i = 0; i < priority.length; i++) {
            if(priority[i] == target) {
                target++;
            }
            else {
                sub.push(priority[i]);
            }
            while(!sub.isEmpty() && sub.peek() == target) {
                sub.pop();
                target++;
            }
        }
        answer = target;
        return answer;
    }
}