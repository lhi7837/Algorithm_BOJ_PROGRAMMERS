class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toLowerCase().toCharArray();
        int idx = 0;
        for(char c : arr) {
            if(c == ' ') {
                idx = 0;
                sb.append(c + "");
            }
            else if(idx % 2 == 0) {
                idx++;
                sb.append(String.valueOf((char)(c-32)));
            }
            else if(idx % 2 == 1) {
                idx++;
                sb.append("" + c);
            }
        }
        String answer = sb.toString();
        return answer;
    }
}