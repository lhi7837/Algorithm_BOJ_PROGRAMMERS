import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue <String> cq1 = new LinkedList<>();
        Queue <String> cq2 = new LinkedList<>();
        boolean[] checked = new boolean[goal.length];
        for(String s : cards1) {
            cq1.add(s);
        }
        for(String s : cards2) {
            cq2.add(s);
        }
        for(int i = 0; i < goal.length; i++) {
            if(goal[i].equals(cq1.peek())) {
                cq1.poll();
                checked[i] = true;
            }
            else if(goal[i].equals(cq2.peek())) {
                cq2.poll();
                checked[i] = true;
            }
            else break;
        }
        for(boolean is : checked) {
            if(is == false) answer = "No";
        }
        return answer;
    }
}