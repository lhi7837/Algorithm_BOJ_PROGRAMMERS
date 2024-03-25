import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = n + "";
        int idx = 0;
        char[] arr = str.toCharArray();
        Character[] character_arr = new Character[arr.length];
        for(char c : arr) {
            character_arr[idx++] = c;
        }
        Arrays.sort(character_arr, Collections.reverseOrder());
        idx = 0;
        for(Character c : character_arr) {
            arr[idx++] = c;
        }
        long answer = Long.parseLong(String.valueOf(arr));
        
        return answer;
    }
}