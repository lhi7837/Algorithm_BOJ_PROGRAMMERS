class Solution {
    public String solution(String s) {
        String answer = s.substring(0,1).toUpperCase();
        StringBuilder sb = new StringBuilder();
        String[] s_str = s.toLowerCase().split("");
        boolean isUpper = false;
        for(int i = 1; i < s_str.length; i++) {
            if(s_str[i - 1].charAt(0) == ' ') isUpper = true;
            if(isUpper) {
                sb.append(s_str[i].toUpperCase());
                isUpper = false; 
            }
            else {
                sb.append(s_str[i].toLowerCase());
            }
        }
        answer += sb.toString();
        return answer;
    }
}