class Solution {
    public int solution(int chicken) {
        int coupon = 0;
        int answer = 0;
        if(chicken < 10) return 0;
        for(int i = 0; i < chicken; i++) {
            coupon++;
            if(coupon == 10) {
                coupon -= 9;
                answer++;
            }
        }
        return answer;
    }
}