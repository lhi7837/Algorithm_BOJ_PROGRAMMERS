import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answer_list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        for(int i = (n == 1 ? 0 : a); i <= (n == 2 ? num_list.length - 1: b); i = (n == 4 ? i + c : i + 1)) {
            answer_list.add(num_list[i]);
        }
        int[] answer = new int[answer_list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer_list.get(i);
        }
        return answer;
    }
}