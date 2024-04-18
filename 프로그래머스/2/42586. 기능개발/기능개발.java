import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++) {
            int cnt = 0;
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                cnt++;
            }
            que.offer(cnt);
        }
        List<Integer> list = new ArrayList<>();
        while(que.size() > 0) {
            int push = que.poll();
            int cnt = 1;
            while(que.size() > 0 && que.peek() <= push) {
                que.poll();
                cnt++;
            }
            list.add(cnt);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}