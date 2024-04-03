import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        while(cnt < n) {
            if(is3x(answer)) {
                cnt++;
            }
            answer++;
        }
        return answer - 1;
    }
    public boolean is3x(int n) {
        String s = n + "";
        if(s.contains("3") || n % 3 == 0) {
            return false;
        }
        return true;       
    }
}