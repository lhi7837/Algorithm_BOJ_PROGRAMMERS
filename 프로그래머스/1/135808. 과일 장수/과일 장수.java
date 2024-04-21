import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : score) {
            pq.offer(i);
        }
        while(pq.size() / m > 0) {
            for(int i = 0; i < m - 1; i++) {
                pq.poll();
            }
            int min = pq.poll();
            answer += min * m;
        }
        return answer;
    }
}