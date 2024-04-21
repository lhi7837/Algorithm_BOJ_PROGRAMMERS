import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> index = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
            priorityQueue.offer(priorities[i]);
            index.offer(i);
        }
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int maxPriority = priorityQueue.peek();
            int idx = index.poll();
            if (current == maxPriority) {
                priorityQueue.poll();
                answer++;
                if (location == idx) {
                    break;
                }
            } else {
                queue.offer(current);
                index.offer(idx);
            }
        }
        
        return answer;
    }
}
