import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // 10,000,000
        for(int i : tangerine) {
            int cnt = map.containsKey(i) ? map.get(i) + 1 : 1;
            map.put(i, cnt);
        }
        List<Integer> list = new ArrayList<>();
        // 10,000,000
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int key : map.keySet()) {
            pq.add(map.get(key));
        }
        // 10,000,000
        while(k > 0) {
            k -= pq.poll();
            answer++;
        }
        return answer;
    }
}