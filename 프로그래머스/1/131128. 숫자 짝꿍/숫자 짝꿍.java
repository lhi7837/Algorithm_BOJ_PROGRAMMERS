import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        Map<Character, Integer> xMap = new HashMap<>();
        Map<Character, Integer> yMap = new HashMap<>();
        for(char c : X.toCharArray()) {
            xMap.put(c, xMap.getOrDefault(c, 0) + 1);
        }
        for(char c : Y.toCharArray()) {
            yMap.put(c, yMap.getOrDefault(c, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        boolean isFriend = false;
        // System.out.println(xMap.keySet().toString());
        // System.out.println(yMap.keySet().toString());
        for(char xKey : xMap.keySet()) {
            for(char yKey : yMap.keySet()) {
                if(xKey == yKey) {
                    int num = Math.min(xMap.get(xKey), yMap.get(yKey));
                    for(int i = 0; i < num; i++) {
                        // if(list.contains(0) && xKey == '0')
                        //     continue;
                        list.add(Integer.parseInt(xKey + ""));
                    }
                    isFriend = true;
                }
            }
        }
        if(!isFriend) return "-1";
        Collections.sort(list, Comparator.reverseOrder());
        if(list.get(0) == 0) return "0";
        for(int i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        return answer;
    }
}