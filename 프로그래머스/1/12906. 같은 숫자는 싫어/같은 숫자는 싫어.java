import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack <Integer> stack = new Stack<>();
        for(int i : arr) {
            if(stack.size() > 0 ? stack.peek() != i : true) {
                stack.add(i);
            }
        }
        int[] answer = stack.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}