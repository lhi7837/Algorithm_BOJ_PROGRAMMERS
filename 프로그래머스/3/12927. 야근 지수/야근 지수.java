import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : works) { 
            que.offer(i);
        }
        while(!que.isEmpty() && n > 0) {
            n--;
            int top = que.poll();
            if(top > 1) {
                que.offer(top - 1);
            }
        }
        if(que.isEmpty()) return 0;
        while(!que.isEmpty()) {
            answer += Math.pow(que.poll(), 2);
        }
        return answer;
    }
}