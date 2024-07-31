class Solution {
    public int solution(int n) {
        int answer = 0;
        long[] dp = new long[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++) {
            long sum = dp[i-1] + dp[i-2];
            dp[i] = sum > 1000000007 ? sum % 1000000007 : sum;
        }
        answer = (int)dp[n-1];
        return answer;
    }
}