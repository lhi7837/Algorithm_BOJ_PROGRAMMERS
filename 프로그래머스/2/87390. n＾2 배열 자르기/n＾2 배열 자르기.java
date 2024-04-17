        //인덱스 i 또는 j에 들어간 값 중 가장 큰 값 ==> 해당 인덱스가 갖고 있는 값
        //int[3,3] ==> 3, int[3,2] ==> 3
        //n=3 으로 size를 나눌 때 --> [0]부터[8]까지
        //즉, left를 n으로 나눈 몫 --> 기존 i, 나눈 나머지 --> 기존 j
            // 123 ==> 몫 0, 나머지 0 ,1, 2
            // 223 ==> 몫 1, 나머지 0, 1, 2
            // 333 ==> 몫 2, 나머지 0, 1, 2
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left) + 1];
        int x = 0;
        int y = 0;
        int idx = 0;
        while(idx < answer.length) {
            for(long j = left; j <= right; j++) {
                x = (int)(j % n);
                y = (int)(j / n);
                answer[idx++] = Math.max(x, y) + 1;
            }
        }
        return answer;
    }
}