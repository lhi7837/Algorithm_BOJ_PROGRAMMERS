import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(citations.length);
        for(int i : citations) {
            pq.add(i);
        }
        while(!pq.isEmpty() && pq.size() > pq.peek()) {
            pq.poll();
        }
        answer = pq.size();
        return answer;
    }
}