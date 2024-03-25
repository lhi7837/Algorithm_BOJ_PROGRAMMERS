import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(i % divisor == 0) list.add(i);
        }
        if(list.size() > 0) {
            answer = new int[list.size()];
            int idx = 0;
            for(int i : list) {
                answer[idx++] = i;
            }
            Arrays.sort(answer);
        }
        else {
            answer = new int[] {-1};
        }
        
        
        return answer;
    }
}