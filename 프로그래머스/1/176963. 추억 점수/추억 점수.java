import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        for(int i = 0; i < photo.length; i++) {
            for(String s : photo[i]) {
                for(String key : map.keySet()) {
                    if(s.equals(key)) {
                        answer[i] += map.get(key);
                    }
                }
            }
        }
        return answer;
    }
}