import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0;
        long sum2 = 0;
        for(int i = 0 ; i < queue1.length; i++) {
            q1.offer(queue1[i]);
            sum1 += queue1[i];
            q2.offer(queue2[i]);
            sum2 += queue2[i];
        }
        int cnt = 0;
        while(cnt <= 4 * queue1.length) {
            if(sum1 > sum2) {
                int poll = q1.poll();
                sum1 -= poll;
                sum2 += poll;
                q2.add(poll);
            }
            else if(sum1 < sum2) {
                int poll = q2.poll();
                sum1 += poll;
                sum2 -= poll;
                q1.add(poll);
            }
            else if(sum1 == sum2) {
                return cnt;
            }
            cnt++;
        }
        
        
        return answer;
    }
}