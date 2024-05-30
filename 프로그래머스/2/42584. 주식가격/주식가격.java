import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            int[] arr = {i, prices[i]};
            
            // 스택이 비어있지 않으면서 현재 가격이 스택의 최상단 가격보다 낮을 때
            while (!stack.isEmpty() && stack.peek()[1] > arr[1]) {
                int[] top = stack.pop();
                answer[top[0]] = i - top[0];
            }
            
            // 현재 가격과 인덱스를 스택에 추가
            stack.push(arr);
        }
        
        // 스택에 남아 있는 경우, 가격이 끝까지 떨어지지 않음
        while (!stack.isEmpty()) {
            int[] top = stack.pop();
            answer[top[0]] = prices.length - 1 - top[0];
        }
        
        return answer;
    }
}
