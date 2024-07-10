import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = s;
        while(str.length() > 0) {
            char x = str.charAt(0);
            int x_cnt = 0;
            int else_cnt = 0;
            char[] arr = str.toCharArray();
            for(int i = 0; i < str.length(); i++){
                // System.out.println(x + " : " + arr[i]);
                if(arr[i] == x) {
                    x_cnt++;
                }
                else {
                    else_cnt++;
                }
                if(x_cnt == else_cnt || i == str.length() - 1) {
                    str = str.substring(i+1);
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}