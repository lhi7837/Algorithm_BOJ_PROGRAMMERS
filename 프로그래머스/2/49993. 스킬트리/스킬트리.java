import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();
        for(char c : skill.toCharArray()) {
            queue.offer(c);
        }
        for(String s : skill_trees) {
            Queue<Character> forUser = queueCopy(queue);
            boolean isOK = true;
            for(char c : s.toCharArray()) {
                if(forUser.contains(c) && forUser.peek() != c) {
                    isOK = false;
                    break;
                }
                if(!forUser.isEmpty() && forUser.peek() == c) {
                    forUser.poll();
                }
            }
            if(isOK) answer++;
            // System.out.println(s + ", " + isOK);
        }
        return answer;
    }
    public Queue<Character> queueCopy(Queue<Character> queue) {
        Queue<Character> copyQueue = new LinkedList<>();
        for(char c : queue) {
            copyQueue.offer(c);
        }
        return copyQueue;
    }
}