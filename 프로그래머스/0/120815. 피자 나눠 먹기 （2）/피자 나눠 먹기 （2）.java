class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 6;
        int b = n;
        int r = 0;
        // 6과 n의 최소공배수를 구하고 6으로 나눔 --> answer
        while(a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        answer = 6 * n / b / 6;
        return answer;
    }
}