class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        for(String s : quiz) {
            String[] split = s.split(" ");
            if("+".equals(split[1])) {
                if(Integer.parseInt(split[0]) + Integer.parseInt(split[2]) == Integer.parseInt(split[4])) answer[idx++] = "O";
                else answer[idx++] = "X";
            }
            else if("-".equals(split[1])) {
                if(Integer.parseInt(split[0]) - Integer.parseInt(split[2]) == Integer.parseInt(split[4])) answer[idx++] = "O";
                else answer[idx++] = "X";
            }
        }
        return answer;
    }
}