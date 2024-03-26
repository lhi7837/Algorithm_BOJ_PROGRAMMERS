import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_str.length(); i+= n) {
            list.add(my_str.substring(i, Math.min(i+n, my_str.length())));
        }
        String[] answer = new String[list.size()];
        int idx = 0;
        for(String s : list) {
            answer[idx++] = s;
        }
        return answer;
    }
}