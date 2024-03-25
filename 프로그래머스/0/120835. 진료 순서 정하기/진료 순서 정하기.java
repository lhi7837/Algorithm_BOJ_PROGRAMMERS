class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int idx = 1;
        for(int i = 100; i > 0; i--) {
            for(int j = 0; j < answer.length; j++) {
                if(i == emergency[j]) answer[j] = idx++;
            }
        }
        return answer;
    }
}