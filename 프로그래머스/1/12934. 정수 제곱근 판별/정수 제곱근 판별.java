class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);
        long answer = Math.sqrt(n) == (long)Math.sqrt(n) ? (long)Math.pow(x+1, 2) : -1;
        return answer;
    }
}