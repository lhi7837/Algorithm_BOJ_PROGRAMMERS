class Solution {
    public int solution(int n) {
        int answer = 0;
        //약수 중 홀수의 개수
        if(n<=2) return 1;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && i % 2 == 1) {
                answer++;
            }
        }
        return answer;
    }
}