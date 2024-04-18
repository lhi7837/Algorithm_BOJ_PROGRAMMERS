import java.util.*;

class Solution {
    public int[] solution(String s) {
        String str = s.replaceAll("[{}]","");
        String[] arr = str.split(",");
        Map <String, Integer> map = new HashMap<>();
        for(String a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int[] cnt = new int[map.size()];
        int idx = 0;
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()) {
            list.add(key);
        }
        int[] answer = new int[list.size()];
        while(list.size() > 0) {
            int max = 0;
            String first = "";
            for(String key : map.keySet()) {
                if(list.contains(key) && max < map.get(key)) {
                    max = map.get(key);
                    first = key;
                }
            }
            list.remove(first);
            answer[idx++] = Integer.parseInt(first);
        }
        
        return answer;
    }
}