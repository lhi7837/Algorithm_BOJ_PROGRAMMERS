import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] before_arr = before.toCharArray();
        char[] after_arr = after.toCharArray();
        Arrays.sort(before_arr);
        Arrays.sort(after_arr);
        for(int i = 0; i < before_arr.length; i++) {
            if(before_arr[i] != after_arr[i]) answer = 0;
        }
        
        return answer;
    }
}