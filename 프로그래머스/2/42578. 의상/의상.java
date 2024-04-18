import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map <String, Integer> type = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            type.put(clothes[i][1], type.getOrDefault(clothes[i][1], 0) + 1);
        }
        for(String key : type.keySet()) {
            answer *= (type.get(key) + 1);
        }
        return answer - 1;
    }
}