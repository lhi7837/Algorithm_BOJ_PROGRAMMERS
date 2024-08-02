import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        //keymap을 돌면서 map 자료형에 각 알파벳별로 가장 빠른 인덱스를 저장
        //없으면 -1을 저장하고, 타겟을 돌면서 매칭하다가 -1을 만나면 바로 리턴 -1
        Map<Character, Integer> map = new HashMap<>();
        for(String s : keymap) {
            for(char c : s.toCharArray()) {
                int idx = s.indexOf(c+"") + 1;
                if(idx > 0) {
                    map.put(c, Math.min(idx, map.getOrDefault(c, 9999)));
                }
            }
        }
        // for(Character key : map.keySet()) {
        //     System.out.println(key + " : " + map.get(key));
        // }        
        for(int i = 0; i < targets.length; i++) {
            for(char c : targets[i].toCharArray()) {
                if(map.containsKey(c)) {
                    answer[i] += map.get(c);
                    // System.out.println(c + " -> " + "answer[i] += " + map.get(c));
                } else {
                    answer[i] = -1;
                    break;
                    // System.out.println("c없음 "+ i);
                }
            }
            
        }

        return answer;
    }
}