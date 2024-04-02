class Solution {
    public int solution(int n) {
        int answer = 0;
        String n_str = Integer.toBinaryString(n);
        int ones = 0;
        for(char c : n_str.toCharArray()) {
            if(c == '1') ones++;
        }
        int i = 1;
        while(true) {
            String n_str2 = Integer.toBinaryString(n + i++);
            int ones2 = 0;
            for(char c : n_str2.toCharArray()) {
                if(c == '1') ones2++;
            }
            if(ones == ones2) {
                answer = Integer.parseInt(n_str2, 2);
                break;
            }
        }
        return answer;
    }
}