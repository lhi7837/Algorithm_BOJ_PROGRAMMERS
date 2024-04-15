class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        /*N == 2의 3승 --> 0조(1,2)부터 3조(7,8)까지 존재함
        A와 B의 값을 2로 나눈다 --> 나머지가 0인 경우 몫 - 1, 1인 경우 몫이 해당 조로 들어감
        속한 조 / 2의 라운드 승의 몫이 같으면 같은 조*/
        a -= 1;
        b -= 1;
        int round = 1;
        int group = (int)Math.pow(2, round);
        while(round <= 20) {
            if(a / group == b / group) {
                break;
            }
            round++;
            group = (int)Math.pow(2, round);
        }
        answer = round;
        return answer;
    }
}