import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Integer[] arr = new Integer[numlist.length];
        for(int i = 0; i < numlist.length; i++) {
            arr[i] = numlist[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, Comparator.comparingInt(o -> { return Math.abs(o - n);}));
        int idx = 0;
        for(int i : arr) {
            answer[idx++] = i;
        }
        return answer;
    }
}