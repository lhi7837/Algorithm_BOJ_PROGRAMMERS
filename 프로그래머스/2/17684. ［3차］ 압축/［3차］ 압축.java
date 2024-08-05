import java.util.*;

class Solution {
    public int[] solution(String msg) {
        // 문자와 인덱스를 담을 해시맵
        Map<String, Integer> dict = new HashMap<>();
        int idx = 1;
        for(char c = 'A'; c <= 'Z'; c++) {
            dict.put(c+"", idx++);
        }

        // 정답을 담을 리스트
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < msg.length();) {
            int len = 1;
            String w = msg.substring(i, i + len);
            
            // 사전에 존재하는 가장 긴 문자열 w를 찾는다
            while(i + len <= msg.length() && dict.containsKey(w)) {
                len++;
                if(i + len <= msg.length()) {
                    w = msg.substring(i, i + len);
                }
            }
            
            // 사전에 존재하지 않는 마지막 문자는 포함하지 않는다
            if(!dict.containsKey(w)) {
                w = w.substring(0, w.length() - 1);
            }
            
            list.add(dict.get(w));
            
            // 새로운 문자열을 사전에 추가
            if(i + w.length() < msg.length()) {
                dict.put(msg.substring(i, i + w.length() + 1), idx++);
            }
            
            // 인덱스를 w의 길이만큼 증가
            i += w.length();
        }
        
        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}
