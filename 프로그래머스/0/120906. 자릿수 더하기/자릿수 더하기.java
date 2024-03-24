class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] n_list = String.valueOf(n).toCharArray();
        for(char c : n_list) {
            answer += c - 48;
        }
        return answer;
    }
}