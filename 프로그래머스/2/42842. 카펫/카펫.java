class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int x = 0;
        int y = 0;
        for(int i = 1; i <= sum/2; i++) {
            if((2+brown/2)*i - Math.pow(i,2) == sum) {
                answer[0] = i;
                answer[1] = sum / i;
            }
        }
        return answer;
    }
}