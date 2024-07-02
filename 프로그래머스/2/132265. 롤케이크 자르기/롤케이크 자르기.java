import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map <Integer, Integer> first = new HashMap<>();
        Set <Integer> second = new HashSet<>();
        int idx = 0;
        for(int i : topping) {
            idx++;
            first.put(i, first.getOrDefault(i, 0) + 1);
        }
        idx -= 1;
        while(!first.isEmpty()) {
            int r = topping[idx--];
            first.replace(r, first.get(r)-1);
            if(first.get(r) <= 0) first.remove(r);
            second.add(r);
            if(first.size() == second.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}