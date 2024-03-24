import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i = 0; i < array.length; i++) {
            str += array[i];
        }
        
        char[] list = str.toCharArray();
        for(char c : list) {
            if(c == '7') answer++;
        }
        return answer;
    }
}