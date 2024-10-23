import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        //choices[i] % 4  -> 해당 유형에 대한 점수, 4보다 큰지, 작은지에 따라서 유형을 선택하기
        Map<Character, Integer> map = new HashMap<>();
        char[] kakao = new char[] {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        //[0]R 라이언 [1]T 튜브, [2]C 콘 [3]F 프로도, [4]J 제이지 [5]M 무지, [6]A 어피치 [7]N 네오
        for(int i = 0; i < survey.length; i++) {
            int score = Math.abs(4 - choices[i]);
            char c = ' ';
            if(choices[i] < 4) { //앞에 선택지
                c = survey[i].charAt(0);
            } else if(choices[i] > 4) { //뒤 선택지
                c = survey[i].charAt(1);    
            } //4번(모르겠음)인 경우 무시
            map.put(c, map.getOrDefault(c, 0) + score);
            // System.out.println(c + " 에 + " + score);
        }
        //점수가 동일하다면 사전순으로 빠른 값을 추가하기
        for(int i = 0; i < 8; i += 2) {
            int front = 0;
            int rear = 0;
            if(map.containsKey(kakao[i])) {
                front = map.get(kakao[i]);
                // System.out.println(kakao[i] + " : " + front);
            }
            if(map.containsKey(kakao[i+1])) {
                rear = map.get(kakao[i+1]);
                // System.out.println(kakao[i+1] + " : " + rear);              
            }
            if(front >= rear) {
                sb.append(kakao[i]);
            } else {
                sb.append(kakao[i+1]);
            }
        }
        
        
        String answer = sb.toString();
        return answer;
    }
}