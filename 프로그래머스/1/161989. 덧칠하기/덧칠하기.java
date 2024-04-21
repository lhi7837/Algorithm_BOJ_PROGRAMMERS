class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        for(int i : section) {
            if(i < start + m) continue;
            answer++;
            start = i;
        }
        return answer;
    }
}