import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i : reserve) {
            map.put(i, 1);
        }
        for(int i : lost) {
            if(!map.containsKey(i)) {
                map.put(i, -1);
            }
            else {
                map.put(i, 0);
            }
        }
        for(int i = 1; i <= n; i++) {
            if(!map.containsKey(i)) {
                map.put(i, 0);
            }
        }
        // System.out.println(map.toString());
        for(int i = 1; i <= n; i++) {
            int target = map.get(i);
            if(target >= 0) {
                answer++;
                continue;
            }
            if(target == -1) {
                // System.out.println("#잃어버림 " + i);
                if(i == n && map.get(i-1) == 1) {
                    map.put(i-1, 0);
                    answer++;
                }
                else if(i == 1 && map.get(i+1) == 1) {
                    map.put(i+1, 0);
                    answer++;
                }
                else if(i > 1 && i < n) {
                    if(map.get(i-1) == 1) {
                        map.put(i-1, 0);
                        answer++;
                    }
                    else if(map.get(i+1) == 1) {
                        map.put(i+1, 0);
                        answer++;
                    }
                }
            }
            // System.out.println("idx==" + i + " : " + map.toString());
            // System.out.println("----");
        }
        return answer;
    }
}