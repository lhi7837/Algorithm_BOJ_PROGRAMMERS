class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) answer++;
        }
        return answer;
    }
    public boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}