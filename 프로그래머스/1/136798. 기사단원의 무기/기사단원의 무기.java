class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        //1. 해당 기사단원(번호)의 약수의 개수 구하기
        //2. 만약 limit < 약수의 개수이면 해당 기사단원의 공격력은 power
        //3. 각 기사단원의 공격력을 모두 더해서 리턴
        for(int i = 1; i <= number; i++) {
            int iron = divisor(i);
            if(iron > limit) answer += power;
            else answer += iron;
        }
        
        return answer;
    }
    public int divisor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
        	if (i * i == n) count++;
	        else if (n % i == 0) count += 2;
        }
        return count;
    }
}