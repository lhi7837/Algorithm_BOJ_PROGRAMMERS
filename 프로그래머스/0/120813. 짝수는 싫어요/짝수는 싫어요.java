import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) list.add(i);
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i : list) {
            answer[idx++] = i;
        }
        return answer;
    }
}