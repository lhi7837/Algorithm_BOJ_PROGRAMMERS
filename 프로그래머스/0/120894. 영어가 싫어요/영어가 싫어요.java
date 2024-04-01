import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] str_key = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String str = numbers;
        for(int i = 0; i < str_key.length; i++) {
            str = str.replaceAll(str_key[i], i + "");
        }
        answer = Long.parseLong(str);
        return answer;
    }
}