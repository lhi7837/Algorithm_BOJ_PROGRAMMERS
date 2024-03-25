import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};
        int[] answer = new int[arr.length-1];
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        int min = arr2[0];
        int idx = 0;
        for(int i : arr) {
            if(i == min) continue;
            answer[idx++] = i;
        }
        return answer;
    }
}