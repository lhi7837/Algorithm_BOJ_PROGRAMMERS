class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bottle = n;
        int coke = 0;
        while(bottle / a > 0) {
            if(bottle < a) break;
            coke += (bottle / a) * b;
            bottle = bottle - ((bottle / a) * a) + (bottle / a) * b;
            // System.out.println("남은 병 : " + bottle + ", " + coke);
        }
        answer = coke;
        return answer;
    }
}