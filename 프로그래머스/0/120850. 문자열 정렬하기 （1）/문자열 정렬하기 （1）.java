import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        char[] arr = my_string.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        for(char c : arr) {
            if(c >= '0' && c <= '9') list.add(String.valueOf(c));
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(String s : list) {
            answer[idx++] = Integer.parseInt(s);
        }
        Arrays.sort(answer);
        return answer;
    }
}