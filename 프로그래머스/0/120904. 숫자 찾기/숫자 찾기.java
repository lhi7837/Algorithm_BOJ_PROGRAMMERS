class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String num_string = String.valueOf(num);
        answer = num_string.contains(String.valueOf(k)) ? num_string.indexOf(String.valueOf(k)) + 1 : -1;

        return answer;
    }
}