import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set <Integer> set = new HashSet<>();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                boolean isPos = true;
                for(int j : set) {
                    if(i % j == 0) isPos = false; 
                }
                if(isPos) {
                    set.add(i);
                    n /= i;
                }
            }
        }
        if(set.size() == 0) return new int[] {n};
        int[] answer = set.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}