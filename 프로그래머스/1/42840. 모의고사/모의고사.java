import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] case1 = new int[] {1, 2, 3, 4, 5};
        int[] case2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] case3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] thrower = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == case1[i % case1.length]) thrower[0]++;
            if(answers[i] == case2[i % case2.length]) thrower[1]++;
            if(answers[i] == case3[i % case3.length]) thrower[2]++;
        }
        int high = 0;
        for(int i = 0; i < 3; i++) {
            if(high < thrower[i]) high = thrower[i];
        }
        List <Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(thrower[i] == high) list.add(i + 1); 
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i : list) {
            answer[idx++] = i;
        }
        return answer;
    }
}