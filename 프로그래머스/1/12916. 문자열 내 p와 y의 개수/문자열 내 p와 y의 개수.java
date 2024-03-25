class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        String str = s.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'p') p++;
            else if(str.charAt(i) == 'y') y++;
        }
        boolean answer = p == y ? true : false;
        return answer;
    }
}