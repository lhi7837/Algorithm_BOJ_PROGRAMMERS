import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scoville2 = new PriorityQueue<>();
        for(int i : scoville) {
            scoville2.offer(i);
        }
        while(scoville2.size() >= 2 && scoville2.peek() < K) {
            int p1 = scoville2.poll();
            int p2 = scoville2.poll();
            scoville2.offer(p1 + p2 * 2);
            if(scoville2.size() == 1 && scoville2.peek() < K) {
                return -1;
            }
            answer++;
        }
        return answer;
    }
}