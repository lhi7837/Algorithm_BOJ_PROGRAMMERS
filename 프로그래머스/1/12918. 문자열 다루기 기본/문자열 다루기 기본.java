class Solution {
    public boolean solution(String s) {
        boolean answer = s.length() == 4 || s.length() == 6 ? true : false;
        if(!s.toUpperCase().equals(s.toLowerCase())) answer = false;
        return answer;
    }
}