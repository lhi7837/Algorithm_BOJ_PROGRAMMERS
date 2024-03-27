import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        int idx = 0;
        for(String ss : str) {
            arr[idx++] = Integer.parseInt(ss);
        }
        Arrays.sort(arr);
        answer += arr[0];
        answer += " ";
        answer += arr[arr.length - 1];
        return answer;
    }
}