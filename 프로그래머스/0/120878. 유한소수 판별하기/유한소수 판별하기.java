import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int x = a / GCD(a, b);
        int y = b / GCD(a, b);
        if(y == 1) return 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 2; i <= y; i++) {
            if(y % i == 0) {
                set.add(i);
                y /= i;
                i--;
            }
        }
        for(int i : set) {
            if(i != 2 && i != 5 ) {
                answer = 2;
            }
        }
        
        return answer;
    }
    
    public int GCD(int a, int b) {
        int x = a;
        int y = b;
        int r = x % y;
        while(r != 0) {
            x = y;
            y = r;
            r = x % y;
        }
        return y;
    }
}