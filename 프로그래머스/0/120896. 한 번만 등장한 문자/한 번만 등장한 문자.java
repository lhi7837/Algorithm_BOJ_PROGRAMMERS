import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(char c = 'a'; c <= 'z'; c++) {
            int cnt = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == c) cnt++;
            }
            if(cnt == 1) answer += c + "";
        }
        return answer;
    }
}