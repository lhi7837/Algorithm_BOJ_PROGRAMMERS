import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] HOF = new int[k];
        for(int i = 0; i < k; i++) {
            HOF[i] = 2000;
        }
        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                HOF[i] = score[i];
                Arrays.sort(HOF);
                answer[i] = HOF[0];
            }    
            else {
                if(HOF[0] < score[i]) {
                    HOF[0] = score[i];
                    Arrays.sort(HOF);
                    answer[i] = HOF[0];
                }
                else answer[i] = HOF[0];
            }
        }
        return answer;
    }
}