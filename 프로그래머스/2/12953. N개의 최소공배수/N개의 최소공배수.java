import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length == 1) return arr[0];
        Queue<Long> queue = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            queue.add((long)arr[i]);
        }
        while(queue.size() > 1) {
            queue.add(lcm(queue.poll(), queue.poll()));
        };
        long long_answer = queue.poll();
        answer = (int)long_answer;
        
        return answer;
    }
    
    public long gcd(long a, long b) {
        long x = a;
        long y = b;
        long r = x % y;
        while(r != 0) {
            x = y;
            y = r;
            r = x % y;
        }
        return y;
    }
    public long lcm(long a, long b) {
        return a * b / gcd(a,b);
    }
}