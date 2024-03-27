class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String s : dic) {    
            int cnt = 0;
            for(String ss : spell) {
                if(s.contains(ss)) cnt++;
            }
            if(cnt == spell.length) answer = 1;
        }
        return answer;
    }
}