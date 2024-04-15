class Solution {
    public static long[] d = new long[2000];
    public long solution(int n) {
        long answer = fibonacci(n) % 1234567;
        return answer;
    }
    public long fibonacci(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        if(d[n] != 0) return d[n] % 1234567;
        d[n] = (fibonacci(n-1) + fibonacci(n-2)) % 1234567;
        return d[n] % 1234567;
    }
}