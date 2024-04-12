import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> map = new HashMap<>();
        int id = 0;
        for(String s : players) {
            map.put(s, id++);
        }
        // for(String s : callings) {
        //     int temp = map.get(s);
        //     map.put(s, map.get(s) - 1);
        // }
        for(int i = 0; i < callings.length; i++) {
            int idx = map.get(callings[i]);
            String temp = answer[idx - 1];
            answer[idx - 1] = callings[i];
            answer[idx] = temp;
            map.replace(callings[i], idx-1);
            map.replace(answer[idx], idx);
        }
        return answer;
    }
}