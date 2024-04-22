import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while(n > 0) {
            stack.push(n % k);
            n /= k;
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        String[] split = sb.toString().split("0");
        for(String s : split) {
            if(!s.equals("") && isPrime(Long.parseLong(s)))
                answer++;
        }
        return answer;
    }
    public boolean isPrime(long n) {
        if(n == 0 || n == 1) {
            return false;
        }
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}