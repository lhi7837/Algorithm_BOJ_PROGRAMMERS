class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!"1".equals(s)) {
            for (char c : s.toCharArray()) {
                if (c == '0') answer[1]++; 
            }
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        return answer;
    }
}